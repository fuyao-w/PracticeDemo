package fanxing;

public class HeirDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Gen1<String> x=new Gen1<String>("王扶摇",99);
System.out.println(x.getGen1());
System.out.println(x.GetNonGen());
	}

}
class NonGen{
	int num;
      NonGen(int num) {
    	  this.num=num;
		
	}
      int GetNonGen(){
    	  return num;
      }
}
class Gen1<T> extends NonGen{
	T ob;
	public Gen1(T ob,int num) {
		super(num);
		this.ob=ob;
		// TODO 自动生成的构造函数存根
	}
	T getGen1(){
		return ob;
	}
}