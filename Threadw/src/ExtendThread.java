
public class ExtendThread {

	public static void main(String[] args) {
		new NewThreads();
		try{
			for(int i=5;i>=0;i--){
				System.out.println("���߳�"+i);
				Thread.sleep(500);
				
			}
		}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		
			System.out.println("���߳̽���");
		

	}

}
class NewThreads extends Thread{
	NewThreads(){
		super("demo Thread");
		System.out.println("���̣߳�"+this);
		start();
	}
	
	public void run(){
		for(int i=5;i>=0;i--){
			System.out.println("���߳�"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
		System.out.println("���߳̽���");
		}
}


