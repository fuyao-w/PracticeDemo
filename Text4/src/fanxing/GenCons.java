package fanxing;

public class GenCons {
	private double val;
    <T extends Number>GenCons(T arg) {
	val=arg.doubleValue();
	}
    void showval(){
    	System.out.println("val  "+val);
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        GenCons text=new GenCons(100);
        GenCons text1 =new GenCons(123.5f);
        text.showval();
        text1.showval();
	}

}
