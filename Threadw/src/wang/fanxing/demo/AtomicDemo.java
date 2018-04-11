package wang.fanxing.demo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicDemo {

	public static void main(String[] args) {
	//	ReentrantLock lock1= new ReentrantLock();
          new AtomThread("a");
          new AtomThread("b");
          new AtomThread("c");
          
	}

}
class Shared{
	static AtomicInteger ai =new AtomicInteger(0);
}

class AtomThread implements Runnable{
	
	String name ;
	public AtomThread(String n) {
    
	name =n;
	 new Thread(this).start();
	}
	@Override
	public void run() {
		//lock1.lock();
		System.out.println("¿ªÊ¼"+ name);
           for (int i = 1; i <= 3; i++) {
                      System.out.println(name+ " got: "+Shared.ai.getAndSet(i));			
		}	
       //    lock1.unlock();
	}
	
}