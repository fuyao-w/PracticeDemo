package Exception;

public class Throwexception {
    static NullPointerException demo(){
    	try{
    		System.out.println("这是异常之前的一句话");
    		
    		throw new NullPointerException("这是一个异常");
    		//throw即为手动抛出的异常，在程序执行到此句之后开始执行catch代码块。
    		
    	}catch(NullPointerException e){
    		System.out.println("demo方法抓到了一个异常");
    		return e;//
    	}
    
    }
    public static void main(String[] args) {
		try{
			
			throw Throwexception.demo();
			
			
		}catch(NullPointerException e){
			System.out.println("在主方法中抓到了一个异常"+e);
		}
	}
}
