import java.util.concurrent.Phaser;

class MyPhaser extends Phaser{
int numPhases;

public MyPhaser(int parties,int phaseCount) {
super(parties);
numPhases=phaseCount - 1;
}
@Override
	protected boolean onAdvance(int p,int regParties) {
	System.out.println("Phase "+p+" Íê³É.\n");
	
	if (regParties==0) {
		return true;
	}
	return false;
	}

}
public class PhaserDemo2 {

	public static void main(String[] args) {
		MyPhaser phsr = new MyPhaser(1, 4);
		
		System.out.println("kaishi");

		new MyThread2(phsr, "A");
	new MyThread2(phsr, "B");
	new MyThread2(phsr, "C");
	new MyThread2(phsr, "D");
	while (!phsr.isTerminated()) {
		phsr.arriveAndAwaitAdvance();
	}
	System.out.println("wanshi");
	}

}
class MyThread2 implements Runnable{
Phaser phsr;
int i=0;
String name;
public MyThread2(Phaser p,String n) {
phsr =p;
name=n;
phsr.register();
new Thread(this).start();
}

	@Override
	public void run() {
           while(!phsr.isTerminated()){
        	   System.out.println("thread "+name+" kaishi"+phsr.getPhase());
        	   int i=0;
        		  do {
        			  phsr.arriveAndDeregister();
        				
        			} while ((i++)==2);
           phsr.arriveAndAwaitAdvance();
           
        
           try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	 }
	
}