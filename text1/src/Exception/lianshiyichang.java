package Exception;

public class lianshiyichang {
	static void demo(){
		NullPointerException e=new NullPointerException(" top layer");
		e.initCause(new ArithmeticException("cause"));
		throw e;
	}
	public static void main(String[] args) {
		try{
			demo();
			
		}catch(NullPointerException e){
			System.out.println("ֱ���쳣"+e);
			System.err.println("�����쳣"+e.getCause());
		}
	}
}
