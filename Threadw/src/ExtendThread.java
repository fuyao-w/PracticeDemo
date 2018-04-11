
public class ExtendThread {

	public static void main(String[] args) {
		new NewThreads();
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
class NewThreads extends Thread{
	NewThreads(){
		super("demo Thread");
		System.out.println("子线程："+this);
		start();
	}
	
	public void run(){
		for(int i=5;i>=0;i--){
			System.out.println("子线程"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
		System.out.println("子线程结束");
		}
}


