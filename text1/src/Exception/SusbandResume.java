package Exception;

public class SusbandResume {

	public static void main(String[] args) {
	NewThread1 ob1=new NewThread1("one");
	NewThread1 ob2 =new NewThread1("two");
	try{
      Thread.sleep(1000);
      ob1.mysuspand();
      System.out.println("suspending thread one");
      Thread.sleep(1000);
      ob1.myresume();
      System.out.println("resuming thread one");
      ob2.mysuspand();
      System.out.println("suspending thread one");
      Thread.sleep(1000);
      ob2.myresume();
      System.out.println("resuming thread one");
      
	}catch(InterruptedException r)
	{
		r.printStackTrace();
	}
	try{
	   System.out.println("等待线程结束");
	   ob1.t.join();
	   ob2.t.join();}
	   catch(InterruptedException e){
		   e.printStackTrace();
	   }
	System.out.println("主线程退出");
	}

}
class NewThread1 implements Runnable{
 String name ;
 Thread t;
 boolean suspendFlag;
	public NewThread1(String threadname) {
	name = threadname;
	t=new Thread(this,name);
	t.start();
		
	}
	
	
	
	public void run() {
		try{// TODO 自动生成的方法存根
		for(int i=15;i>0;i--){
			System.out.println(name+":"+i);
			Thread.sleep(200);
			synchronized(this){
				while(suspendFlag){
					wait();
			}
		}
		}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(name+"exiting");
	}
	synchronized void mysuspand(){
		suspendFlag =true;
	}
	synchronized void myresume(){
		suspendFlag =false;
		notify();
	}
	
	
	
	}
	
		


