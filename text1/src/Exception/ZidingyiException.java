package Exception;

public class ZidingyiException {

	static void compue(int a) throws Myexceptiondemo{
		System.out.println("Cakked compue("+a+")");
		if(a>10)
			throw new Myexceptiondemo(a);
		System.out.println("û���쳣");
	}
	public static void main(String[] args) {
		try{
			compue(1);
			compue(11);
		}catch(Myexceptiondemo e ){
			System.out.println("�������쳣"+e);
			
		}
	}
}
@SuppressWarnings("serial")
class Myexceptiondemo extends Throwable {
    private int  detail;
    public Myexceptiondemo(int a) {
	 detail =a;
    	
	}
    public String tostring()
    {
    	return "�ҵ��쳣" + detail ;
    }
	
}
