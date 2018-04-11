
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new NewThread();
		
		try{
			for(int i=5;i>=0;i--){
				System.out.println("子线程"+i);
				Thread.sleep(500);
				
			}
		}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		
		System.out.println("主线程结束");

	}

}
class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t=new Thread(this,"Demo thread");
		System.out.println(t);
		t.start();
	}
	
	public void run() {
		try{
			for(int i=5;i>=0;i--){
				System.out.println("子线程"+i);
				Thread.sleep(500);
				
			}
		}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		
		System.out.println("子线程结束");
	}
}