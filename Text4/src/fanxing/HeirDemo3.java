package fanxing;

public class HeirDemo3 {
	public static void main(String[] args) {
		
	
   Gen11<Integer> iob =new Gen11<>(88);
   Gen22<Integer> iob2=new Gen22<>(99);
   Gen22<String>  strob=new Gen22<>("王扶摇");
   if(iob instanceof Gen22<?>)
		System.out.println("是的");//iob是某种形式的Gen11类型 是超类，不是Gen22的实例
   if(iob2 instanceof Gen22<?>)
	System.out.println("是");
   if(iob2 instanceof Gen11<?>)
	   System.out.println("shi");
   
 //  if(iob2 instanceof Gen11<String>)
   //在运行时无法使用泛型类型信息，instancesof无法知道iob2是否是Gen11<S>类型的实例
   
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