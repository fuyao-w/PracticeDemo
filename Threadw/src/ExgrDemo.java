import java.util.concurrent.Exchanger;

public class ExgrDemo {

	public static void main(String[] args) {
		Exchanger<String> exger =new Exchanger<>();
		
		new UseString(exger);
		new MakeString(exger);

	}

}

class MakeString implements Runnable{
	Exchanger<String> ex;
	String str;
	
	public MakeString(Exchanger<String> c) {
	  ex= c;
	  str = new String();
	  new Thread(this).start();
		// TODO �Զ����ɵĹ��캯�����
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
	char ch='A';
	for (int i = 0; i < 3; i++) {
		
		for (int j = 0; j < 5; j++) 
		str +=ch++;
		try {
			 ex.exchange(str);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	
	}
	}
	
	
}
class UseString implements Runnable{
	Exchanger<String > ex;
	String str1;
	public UseString(Exchanger<String> c)  {
	ex=c;
	new Thread(this).start();
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
	for (int i = 0; i < 3; i++) {
		try {
			str1=ex.exchange(new String());
			System.out.println("got "+str1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	
			}	
	}
	
}

