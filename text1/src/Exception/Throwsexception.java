package Exception;

public class Throwsexception {
static void throwone()throws IllegalAccessError{//IllegalAccessError�쳣����δ�������쳣���������������Ƿ�������׳�������쳣�����Լ�ʹȥ��
	//throws ill������Ҳ�������г���
	System.out.println("�쳣����");
	throw new IllegalAccessError("demo");
}
public static void main(String[] args) {
	try {
		throwone();
		
	}catch(IllegalAccessError e){
		System.out.println("����������ץ���쳣"+e);
	}
}
}
