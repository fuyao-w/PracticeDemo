package Exception;

public class Throwexception {
    static NullPointerException demo(){
    	try{
    		System.out.println("�����쳣֮ǰ��һ�仰");
    		
    		throw new NullPointerException("����һ���쳣");
    		//throw��Ϊ�ֶ��׳����쳣���ڳ���ִ�е��˾�֮��ʼִ��catch����顣
    		
    	}catch(NullPointerException e){
    		System.out.println("demo����ץ����һ���쳣");
    		return e;//
    	}
    
    }
    public static void main(String[] args) {
		try{
			
			throw Throwexception.demo();
			
			
		}catch(NullPointerException e){
			System.out.println("����������ץ����һ���쳣"+e);
		}
	}
}
