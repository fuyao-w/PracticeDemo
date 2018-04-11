
public class ACDemo {
static byte a[]={65,66,67,68,69};
static byte b[]={66,66,66,66,66};
	public static void main(String[] args) {
		System.out.println(new String(a));
		System.out.println(new String(b));
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println( new String(b));
		System.out.println(System.getProperty("user.dir")+"   "+System.getProperty("os.home"));
		

	}

}
