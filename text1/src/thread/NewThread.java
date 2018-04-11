package thread;

public class NewThread {
	 static char A[]=new char[]{'1','2','3','4','5'};
      static void aaa() {
    	  
    	  
    		  try {
    			  for(char x:A){
    			  Thread.sleep(1000);
    			  System.out.print(x);}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
    	 
    	
    	  
    	  }
      
	public static void main(String[] args) {
		Thread t =Thread.currentThread();
       // NewThread t1= new NewThread();
       
		System.out.println("current thread"+t);
		
		t.setName("My thread");
		System.out.println("修改后的线程信息"+t);
		
		try{
			for(int i=0;i<5;i++){
			 NewThread.aaa();
			 Thread.sleep(1000);}
            
		}catch(InterruptedException e){
				System.out.println("主线程中断");
			}
		}
}
		

	


