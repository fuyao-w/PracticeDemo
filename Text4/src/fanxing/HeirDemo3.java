package fanxing;

public class HeirDemo3 {
	public static void main(String[] args) {
		
	
   Gen11<Integer> iob =new Gen11<>(88);
   Gen22<Integer> iob2=new Gen22<>(99);
   Gen22<String>  strob=new Gen22<>("����ҡ");
   if(iob instanceof Gen22<?>)
		System.out.println("�ǵ�");//iob��ĳ����ʽ��Gen11���� �ǳ��࣬����Gen22��ʵ��
   if(iob2 instanceof Gen22<?>)
	System.out.println("��");
   if(iob2 instanceof Gen11<?>)
	   System.out.println("shi");
   
 //  if(iob2 instanceof Gen11<String>)
   //������ʱ�޷�ʹ�÷���������Ϣ��instancesof�޷�֪��iob2�Ƿ���Gen11<S>���͵�ʵ��
   
	//   System.out.println("shi");
	}   
}
class Gen11<T>{
	T ob;
	Gen11(T ob){
		this.ob=ob;
	}
	T getob(){
		return ob;
	}
}
class Gen22<V> extends Gen11<V>{
	Gen22(V ob){
		super(ob);
	}
	
}