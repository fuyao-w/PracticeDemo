import java.util.ArrayList;

public class ArryListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		System.out.println("��ʼ�����С�� "+a1.size());
		
		a1.add("C");
		a1.add("A");
		a1.add("S");
		a1.add("D");
		a1.add("F");
		a1.add(1,"A2");
		System.out.println("��ӹ���������СΪ: "+a1.size());
		System.out.println(a1);
		a1.remove("F");
		a1.remove(2);			
		System.out.println(a1);
		System.out.println(a1.size());
		
	}

}
