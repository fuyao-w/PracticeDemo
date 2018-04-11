
public class Stringmake {
	static  char ch
	="abc".charAt(1);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		System.out.println(ch);
//		String s="1234567890";
//		int start=2;
//		int end=5;
//		char buf[]=new char[end-start+4];//指定接受字符串的数组
//		s.getChars(start,end,buf,4);//最后一个参数是在buf中开始复制字符串的索引从0开始
//		System.out.println(buf);
//		System.out.println(buf.length);
//	    String s2="wang";
//	    String s3="wang";
//	    String s4="WANG";
//	    System.out.println(s2.equals(s3));
//	    System.out.println(s2.equalsIgnoreCase(s4));
//	  System.out.println(s2.regionMatches(2,s3,2,2));//同下
//	  System.out.println(s2.regionMatches(true, 2, s4, 2, 2));//索引从0开始
//	  System.out.println("wangfuyao".startsWith("wang") );
//	  System.out.println("wangfuyao".endsWith("yao"));
//	  System.out.println("wangfuyao".startsWith("fu",4));
	  String s1="hello";
	  String s6=new String(s1);
	 
	  System.out.println(s1.equals(s6));//此方法比较String对象中的字符是否相同
	  System.out.println(s1==s6);//== 比较两个对象的引用,也就是说引用的是不是相同的对象
	  /*
	   * 变量s1用用由“hello"创建的String实例，s2引用的对象是使用s1作为初始化器创建的。即S1 S2
	   * 两个String对象的内容是相同的，但他们是不同的对象
	   * 引用的不是相同的对象
	   * 
	   */
	 
	}

}
