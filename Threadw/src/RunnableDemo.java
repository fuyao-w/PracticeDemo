
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new NewThread();
		
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