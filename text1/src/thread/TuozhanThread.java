package thread;

public class TuozhanThread extends Thread {
    TuozhanThread(){
    	super("子线程");
    	System.out.println("子线程信息"+this);
    	start();
    	
    }
    public void run(){
    	try{
    		for(int i=5;i>0;i--){
    			System.out.println("子线程"+"\t"+i);
    			Thread.sleep(500);
    		}
    		}catch(InterruptedException r)
    		{
    			r.printStackTrace();
    		}
    	System.out.println("子线程停止");
    	}
    }
