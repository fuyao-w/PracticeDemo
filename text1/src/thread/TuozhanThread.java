package thread;

public class TuozhanThread extends Thread {
    TuozhanThread(){
    	super("���߳�");
    	System.out.println("���߳���Ϣ"+this);
    	start();
    	
    }
    public void run(){
    	try{
    		for(int i=5;i>0;i--){
    			System.out.println("���߳�"+"\t"+i);
    			Thread.sleep(500);
    		}
    		}catch(InterruptedException r)
    		{
    			r.printStackTrace();
    		}
    	System.out.println("���߳�ֹͣ");
    	}
    }
