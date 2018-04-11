package Exception;



public class Synch{
	public static void main(String msg[]){
		Callme target=new Callme();
		
		 Caller ob1=new Caller(target,"hello");
		 
		Caller ob2=new Caller(target,"synchronized");
		
		Caller ob3=new Caller(target,"world");
		
		
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}

class Callme {
 void call(String msg){
	System.out.println("�߳̿�ʼ");
	System.out.println("ִ��");
	
	System.out.println("["+msg);
	try{
		Thread.sleep(1000);
		
	}catch(InterruptedException e){
		System.out.println("Interrupt");
		
	}
	System.out.println("]");
	
}
}
class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	
	public Caller (Callme targ, String s ){
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		
		synchronized(target){
          
			target.call(msg);
		}
		}
	
	


}
