package wang.fanxing.demo;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
              
		ReentrantLock lock =new ReentrantLock();
		new LockThread(lock, "A");
		new LockThread(lock, "B");
	}

}
class Share {
	static int count = 0 ;
}
class LockThread implements Runnable{
	String name;
	ReentrantLock lock;
	
	public LockThread(ReentrantLock lock,String name) {
        this.lock=lock;
        this.name=name;
        new Thread(this).start();
	}
	
	@Override
	public void run() {
          System.out.println("开始"+name);
 		 
          try {
			  System.out.println(name+" 正在等待为Count上锁");
			  lock.lock();
			  System.out.println(name +" 已经为COUNT上锁");
			  
			  Share.count++;
			  
			  System.out.println(name+": "+Share.count);
			  
			  System.out.println(name +" 整在休眠");
			  
			  Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
          finally {
			System.out.println(name +" 已经解锁");
			lock.unlock();
		}
	}
	
}