package thread;


public class Childthreads implements Runnable{
	char[] a=new char[5];
	String name;
	Thread t;
    Childthreads(String name){
    	this.name=name;
    	t=new Thread(this,name);
    	System.out.println("���߳���Ϣ"+t);
    	t.start();
    }
	public void run(){
		int v=0;
		try{
			for(int x:a)
				{
				v+=1;
						System.out.println("���߳�"+name+"\t"+v);
			Thread.sleep(500);}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("�߳�ֹͣ");
	}
	
}
