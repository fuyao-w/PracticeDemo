package fanxing;

public class HeirDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Gen1<String> x=new Gen1<String>("����ҡ",99);
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
		// TODO �Զ����ɵĹ��캯�����
	}
	T getGen1(){
		return ob;
	}
}