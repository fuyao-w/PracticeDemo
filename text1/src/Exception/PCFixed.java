package Exception;

public class PCFixed {
public static void main(String[] args) {
	Q q=new Q();
	
	 Producer ob1=new Producer(q);
	 Consumer ob2 =new Consumer(q);
	
	 try{
		 ob1.t.join();
		 ob2.t.join();
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
	
	
}
}
class Q{
	int n;
	boolean valueSet=false;
	synchronized int get(){
		while(!valueSet){
			try{
				
				wait();
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Got"+n);
		valueSet=false;
		
			notify();
		
		
		return n;
	}
	synchronized void put(int n){
		while(valueSet){
			try{
			
					wait();
			}catch(InterruptedException r)
			{
				r.printStackTrace();
			}
			
		}
		this.n=n;
		valueSet=true;
		System.out.println("put"+n);
		notify();
		
		
	}
	
}
class Producer implements Runnable{
	Q q;
	Thread t;
	Producer(Q q){
		this.q=q;
		t=new Thread(this,"producer");
		t.start();
	}
		public void run(){
			
			int i =0;
			while(true){
				
				q.put(i++);
				
				if(i==5)
					
					break;
			}
		}
	
	
}
class 	Consumer implements Runnable{
	Q q;
	Thread t;
	Consumer(Q q){
		this.q=q;
		 t=new Thread(this,"consumer");
		t.start();
		
	}
	public void run(){
		while(true){
			q.get();
			if(q.n==4){
				System.out.println("ֹͣ");
			}
			
		}
	}
	
}
