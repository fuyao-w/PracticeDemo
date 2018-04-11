import java.util.concurrent.Phaser;

public class PhaserDemo {

	public static void main(String[] args) {
       Phaser phsr = new Phaser(1);
       int curPhae;
       int c;
       System.out.println("��ʼ");
       
       new MyThread3(phsr, "A");
       new MyThread3(phsr, "B");
       new MyThread3(phsr, "C");
       
       curPhae =phsr.getPhase(); 
       
    		  c= phsr.arriveAndAwaitAdvance();
    		  
       System.out.println("Phase "+curPhae+" ���");
       
       curPhae =phsr.getPhase(); 
       phsr.arriveAndAwaitAdvance();
       System.out.println("Phase "+curPhae+" ���");
       
       curPhae =phsr.getPhase(); 
        phsr.arriveAndAwaitAdvance();
       System.out.println("Phase "+curPhae+" ���");
      
       phsr.arriveAndDeregister();
      
       if (phsr.isTerminated()) {
    	   System.out.println("����");
		System.out.println(c);
	}
	}

}
class MyThread3 implements Runnable{
	Phaser phsr;
	String name;
	
	public MyThread3(Phaser p,String n) {
     phsr = p;
     name = n;
     phsr.register();
     new Thread(this).start();
	}
	
	
	
	@Override
	public void run() {
       System.out.println("Thread "+name+" Beginning Phase One");
       
       phsr.arriveAndAwaitAdvance();
       
       try {
		Thread.sleep(10);
	} catch (Exception e) {
		e.printStackTrace();
	}
       
   System.out.println("Thread "+name+" Beginning Phase Two");
       
       phsr.arriveAndAwaitAdvance();
       
       try {
		Thread.sleep(10);
	} catch (Exception e) {
		e.printStackTrace();
	}
       
   System.out.println("Thread "+name+" Beginning Phase Three");
       
       phsr.arriveAndDeregister();
       
  
	}
	
}