import java.util.concurrent.Semaphore;

public class ProdCon {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Q q=new Q();
      new Consumer(q);
       new Producer(q);
	}

}
class Q{
	int n;
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);
	
	void get(){
		try {
			semCon.acquire();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("got"+n);
		semProd.release();
	}
	void put(int n){
		this.n=n;
		try {
			semProd.acquire();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("put"+n);
		semCon.release();
	}
}
class Producer implements Runnable{
	Q q;
 public Producer(Q q) {
     this.q=q;
     new Thread(this,"Producer").start();
	 // TODO 自动生成的构造函数存根
}
	@Override
	public void run() {
 		for (int i = 0; i < 20; i++) {
			q.put(i);
			System.out.println("p "+i);
			
		}
		
	}
 	
	
	
}
class Consumer implements Runnable{
	Q q;
 public Consumer(Q q) {
     this.q=q;
     new Thread(this,"Consumer").start();
	 // TODO 自动生成的构造函数存根
}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			q.get();
			System.out.println(i);
			
		}
		
	}
 	
	
	
}


