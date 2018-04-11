package fanxing;
public class HeirDemo{
	
	public static void main(String[] args) {
		Gen2<String,Integer> x =new Gen2<String,Integer>("王扶摇",88);
		System.out.println(x.getob());
		System.out.println(x.gett());
	}
}
class Gen<T> {
T ob;
  Gen(T ob) {

	this.ob=ob;
	// TODO 自动生成的构造函数存根
}
 T getob(){
	 return ob;
 }
}
class Gen2<T,V> extends Gen<T>{
	V v;
	Gen2(T t,V o){
		super(t);
		this.v=o;
	}
	V gett(){
		return v;
	}
}
