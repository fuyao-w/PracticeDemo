package fanxing.wang;

public class SimpGen {

	public static void main(String[] args) {
		TwoGen<Integer,String> tgobj=new TwoGen<Integer,String>(88,"Generics");
		tgobj.showType(); 
		int v=tgobj.getob1();
		System.out.println("value"+"\t"+v);
		String s=tgobj.getob2();
		System.out.println("value"+"\t"+s);
	}

}


class TwoGen<T,V>{
	T ob1;
	V ob2;
	TwoGen(T o1,V o2){
		ob1=o1;
		ob2=o2;
	}
	
	void showType(){
		System.out.println("T的类型"+ob1.getClass().getName());
		System.out.println("T的类型"+ob2.getClass().getName());
		
	}
	T getob1(){
		return ob1;
	}
	V getob2(){
		return ob2;
	}
	
	
}