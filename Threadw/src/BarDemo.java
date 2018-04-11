import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

	public static void main(String[] args) {
		 //BarAction w = new BarAction();
		CyclicBarrier cb = new CyclicBarrier(2,new BarAction());
		//�ڶ���������ִ��һ��Runnable���͵ģ����������õ��̲߳���ʵ�� Start������
	 //Ҳ����ִ����Ӧ�߳�Run�����еĴ���   ����ò���������߳���ִ�еģ��൱��û�д������µ��߳�
		//start��������������CPU����������һ���߳̿ռ���ִ��Run�����Ĵ��롣Ҳ����˵��ӾSTART����������������һ���µ��߳�
		System.out.println("Staring");
		
		new MyThread1(cb, "A");
		new MyThread1(cb, "B");
		new MyThread1(cb, "C");
		new MyThread1(cb, "D");
  
		//CyclicBarrier Ҳ�����ظ�ʹ�ã���ָ���������̵߳���await�����Ժ󣬾ͻ��ͷŵȴ��̡߳�
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
	
	
	// TODO �Զ����ɵĹ��캯�����
}
	
	
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
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