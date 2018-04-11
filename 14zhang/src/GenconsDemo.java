
public class GenconsDemo {

	public static void main(String[] args) {
	Gencons t1=new Gencons(100);
	Gencons t2=new Gencons(200);
	t1.show();
	t2.show();
	}

}
class Gencons{
	private double val;
	<T extends Number>Gencons(T arg){
		val = arg.doubleValue();
	}
	void show(){
		System.out.println(val);
	}
}