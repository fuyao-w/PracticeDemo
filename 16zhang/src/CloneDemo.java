

public class CloneDemo {

	public static void main(String[] args) {
		TestClone x1=new TestClone();
		TestClone x2;
		x1.a=10;
		x1.b=20.98;
		
		x2=x1.colneTest();
		System.out.println(x1.a+" "+x1.b);
		System.out.println(x2.a+" "+x2.b);
		
	}

}
class TestClone implements Cloneable{
	int a;
	double b;
	TestClone colneTest(){
		try{
			return  (TestClone) super.clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			return this;

		}
			}
}