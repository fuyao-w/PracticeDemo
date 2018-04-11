
public class ThreadGropDemo {

	public static void main(String[] args) {
		ThreadGroup groupA=new ThreadGroup("Group A");
		ThreadGroup groupB=new ThreadGroup("Group B");
		
		NewThread ob1=new NewThread(groupA,"one");
		NewThread ob2=new NewThread(groupA,"two");
		NewThread ob3=new NewThread(groupB,"three");
		NewThread ob4=new NewThread(groupB,"four");
		
		System.out.println("\nHere is output fuom list():");
		Thread tga[]=new Thread[groupA.activeCount()];
		groupA.enumerate(tga);
		
		for(int i=0;i<tga.length;i++){
			((NewThread)tga[i]).mysuspand();
		}
		
		try{
			Thread.sleep(4000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("GroupA 继续");
		for(int i=0;i<tga.length;i++){
			((NewThread)tga[i]).myresume();
		}
		
		try{
			System.out.println("等待主线程");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("主线程结束");

	}

}
class NewThread extends Thread{
	boolean suspandFlag;

	NewThread(ThreadGroup tgob,String threadname){
        super(tgob,threadname);
		System.out.println("New Thread  "+this);
		suspandFlag=false;
		start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(getName()+": "+i);
				Thread.sleep(1000);
				synchronized(this){
					while(suspandFlag)
						wait();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(getName()+" exiting");
	}
	synchronized void myresume(){
		suspandFlag=false;
	    notify();
	}
	synchronized void mysuspand(){
		
		suspandFlag =true;
	}
}