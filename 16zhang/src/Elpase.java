
public class Elpase {


	public static void main(String[] args) {
		long start,end;
		// TODO �Զ����ɵķ������
     //start =System.currentTimeMillis();
		start=System.nanoTime();
     for (long i = 0; i < 10000000000L; i++) ;
     //end=System.currentTimeMillis();
     end=System.nanoTime();
     System.out.println(end-start);
		
		
	
	}

}
