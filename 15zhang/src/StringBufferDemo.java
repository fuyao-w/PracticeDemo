
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("Buffer = "+sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		sb.setCharAt(2,'u');
        System.out.println(sb);
        sb.setLength(2);
        System.out.println(sb);
        
        String s;
        int a =42;
        StringBuffer ssb=new StringBuffer(40);
        s=ssb.append("a=").append(a).append("!").toString();
        System.out.println(s);
        StringBuffer ss=new StringBuffer("i  java");
        ss.insert(2, "like");
        System.out.println(ss);
        ss.reverse();
        System.out.println(ss);
        ss.delete(2,5);
        System.out.println(ss);
        ss.deleteCharAt(5);
        System.out.println(ss);
        ss.replace(0,2,"www");
        System.out.println(ss);
        System.out.println(ss.substring(1));
        System.out.println(ss.substring(1, 2));
        StringBuffer w=new StringBuffer("one two one");
        System.out.println(w.indexOf("one"));
        System.out.println(w.lastIndexOf("one"));
	}

}
