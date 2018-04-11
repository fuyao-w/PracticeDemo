package thread;

public class ExtendsThread {
	public static void main(String[] args) {
		
		 Childthreads ob1	=new Childthreads("one");
		 Childthreads ob2	=new Childthreads("two");
//		 Childthreads ob3	=new Childthreads("three");
		
		try{
			for(int s=5;s>0;s--)
			{
				System.out.println(ob1.t.isAlive());
				ob1.t.join();
				ob2.t.join();
				
//				ob3.t.join();
				System.out.println("主线程"+s);
				Thread.sleep(1000);
				
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	System.out.println("主线程停止");
}}
