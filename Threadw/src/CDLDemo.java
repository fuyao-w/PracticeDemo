import java.util.concurrent.CountDownLatch;

public class CDLDemo {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		System.out.println("starting");
		
		new MyThread(cdl);
		
		try {
			cdl.await();   //主线程对CDL调用AWAIT方法，导致主线程的执行暂停
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("down");
	}

}
class MyThread implements Runnable{
	CountDownLatch latch;
public MyThread(CountDownLatch c) {
     latch = c;
     new Thread(this).start();
	
	// TODO 自动生成的构造函数存根
}
	
	
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i <5; i++) {
			System.out.println(i);
			latch.countDown();  //计数器递减5次
			
		}
	}
	
}
