import java.util.concurrent.CountDownLatch;

public class CDLDemo {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		System.out.println("starting");
		
		new MyThread(cdl);
		
		try {
			cdl.await();   //���̶߳�CDL����AWAIT�������������̵߳�ִ����ͣ
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
	
	// TODO �Զ����ɵĹ��캯�����
}
	
	
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i <5; i++) {
			System.out.println(i);
			latch.countDown();  //�������ݼ�5��
			
		}
	}
	
}
