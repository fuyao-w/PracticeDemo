
public class Stringmake {
	static  char ch
	="abc".charAt(1);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		System.out.println(ch);
//		String s="1234567890";
//		int start=2;
//		int end=5;
//		char buf[]=new char[end-start+4];//ָ�������ַ���������
//		s.getChars(start,end,buf,4);//���һ����������buf�п�ʼ�����ַ�����������0��ʼ
//		System.out.println(buf);
//		System.out.println(buf.length);
//	    String s2="wang";
//	    String s3="wang";
//	    String s4="WANG";
//	    System.out.println(s2.equals(s3));
//	    System.out.println(s2.equalsIgnoreCase(s4));
//	  System.out.println(s2.regionMatches(2,s3,2,2));//ͬ��
//	  System.out.println(s2.regionMatches(true, 2, s4, 2, 2));//������0��ʼ
//	  System.out.println("wangfuyao".startsWith("wang") );
//	  System.out.println("wangfuyao".endsWith("yao"));
//	  System.out.println("wangfuyao".startsWith("fu",4));
	  String s1="hello";
	  String s6=new String(s1);
	 
	  System.out.println(s1.equals(s6));//�˷����Ƚ�String�����е��ַ��Ƿ���ͬ
	  System.out.println(s1==s6);//== �Ƚ��������������,Ҳ����˵���õ��ǲ�����ͬ�Ķ���
	  /*
	   * ����s1�����ɡ�hello"������Stringʵ����s2���õĶ�����ʹ��s1��Ϊ��ʼ���������ġ���S1 S2
	   * ����String�������������ͬ�ģ��������ǲ�ͬ�Ķ���
	   * ���õĲ�����ͬ�Ķ���
	   * 
	   */
	 
	}

}
