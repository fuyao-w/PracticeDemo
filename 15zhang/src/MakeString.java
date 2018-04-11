
public class MakeString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[] c= {'j','a','v','a'};
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(s1+"   "+s2);
		String s=new String(c,0,2);
		System.out.println(s);
		byte[] ascii={65,66,68,69,70};
		String s3=new String(ascii);
		String s33=new String(ascii, 2, 3);
		System.out.println(s3+"   "+s33);
		System.out.println(s3.length());
		String s4="abc";
		System.out.println("abc".length()+"  "+s4.length());//java会为每个字面值创造对象
		
		String age="9";
		String s5="He is "+age+" years old";
		System.out.println(s5);
		String s55="aaaaaaaaaaaaaaaaaa"+
		"ccccccccccccccccc"+
				"bbbbbbbbbbbbbbbbb";
		System.out.println(s55);
		int ages=9;
		String s6="他今年"+ages+"岁了"+2+2+(2+3);
		System.out.println(s6);
		

	}

}
