
public class CloneDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    TestClone1 x1=new TestClone1();
    TestClone1 x2;
    x1.a=10;
    x1.b=3.4;
    x2=(TestClone1) x1.clone();
    System.out.println(x1.a+" "+x1.b);
    System.out.println(x2.a+" "+x2.b);
	}

}
 class TestClone1 implements Cloneable{
	int a;
	double b;
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("buxing");
			return this;
		}
	}
	
}