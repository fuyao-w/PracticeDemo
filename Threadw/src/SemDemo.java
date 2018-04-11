import java.util.concurrent.Semaphore;

public class SemDemo {
public static void main(String[] args) {
	Semaphore sem = new Semaphore(1);
	new IncThread(sem, "A");
	new DecThread(sem, "B");
}

}

class shared{
	static int count=0;
}
class IncThread implements Runnable{
	String name;
	Semaphore sem;
	
	public IncThread(Semaphore s,String n) {
		sem=s;
		name=n;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("starting"+name);
		
		try {
			System.out.println(name+"is waiting for a permit.");
			sem.acquire();
			System.out.println(name+"get a permit");
			
			
			for (int i = 0; i < 5; i++) {
			shared.count++;	
			System.out.println(name+":"+shared.count);
			Thread.sleep(10);
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(name+"释放许可证");
	    sem.release();
	}
	
}
class DecThread implements Runnable{
	String name;
	Semaphore sem;
	
	public DecThread(Semaphore s,String n) {
		sem=s;
		name=n;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("starting"+name);
		
		try {
			System.out.println(name+"is waiting for a permit.");
			sem.acquire();
			System.out.println(name+"get a permit");
			
			
			for (int i = 0; i < 5; i++) {
			shared.count--;	
			System.out.println(name+":"+shared.count);
			Thread.sleep(10);
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(name+"释放许可证");
	  sem.release();
	}
}

