package fanxing.wang;

public class Gendemo {
public static void main(String[] args) {
	Gen<Integer> iob;
	iob =new Gen<Integer>(88);
	iob.showType();
	int v =iob.getob();
	System.out.println("value"+v);
	Gen<String>strob =new Gen<String>("Generics Text");
	strob.showType();
	String str = strob.getob();
	System.out.println("value"+str);
}
}
class Gen<T>{//只要声明类型参数就在<>指定
	T ob;//类型参数的名称 
	Gen(T o){
		ob=o;
	}
	T getob(){
		return ob;
	}
	void showType(){
		System.out.println("T的类型为"+ob.getClass().getName());
	}
}