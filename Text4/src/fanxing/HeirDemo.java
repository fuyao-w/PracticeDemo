package fanxing;
public class HeirDemo{
	
	public static void main(String[] args) {
		Gen2<String,Integer> x =new Gen2<String,Integer>("����ҡ",88);
		System.out.println(x.getob());
		System.out.println(x.gett());
	}
}
class Gen<T> {
T ob;
  Gen(T ob) {

	this.ob=ob;
	// TODO �Զ����ɵĹ��캯�����
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
