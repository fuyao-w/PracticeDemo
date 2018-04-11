import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

	public static void main(String[] args) {
		 //BarAction w = new BarAction();
		CyclicBarrier cb = new CyclicBarrier(2,new BarAction());
		//第二个参数是执行一个Runnable类型的，所以他调用的线程不必实现 Start方法，
	 //也可以执行相应线程Run方法中的代码   但是貌似是在主线程中执行的，相当于没有创建出新的线程
		//start方法的作用是在CPU中申请另外一个线程空间来执行Run方法的代码。也就是说电泳START方法才真正创建了一个新的线程
		System.out.println("Staring");
		
		new MyThread1(cb, "A");
		new MyThread1(cb, "B");
		new MyThread1(cb, "C");
		new MyThread1(cb, "D");
  
		//CyclicBarrier 也可以重复使用，当指定数量的线程调用await方法以后，就会释放等待线程。
		System.out.println("sssssssssss");
   //new Thread(w).start();
   
	}

}


class MyThread1 implements Runnable{
CyclicBarrier cbar;
String name;

public MyThread1(CyclicBarrier c,String n) {

	cbar = c;
	name = n;
	new Thread(this).start();
	
	
	// TODO 自动生成的构造函数存根
}
	
	
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
	System.out.println(name);
	
	try {
		cbar.await();
		
		
	} catch (BrokenBarrierException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
}


class BarAction implements Runnable{

	
	public void run() {
	System.out.println("Barrier Reached!");
	
	}
}