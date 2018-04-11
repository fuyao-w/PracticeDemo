package fanxing.wang;

public class GenMethDemo {
static <T,V extends T> boolean isln(T x,V y[]){
	for(int i=0;i<y.length; i++)
		if(x.equals(y[i]))
           return true;	
		
			return false;
		
		

}
	public static void main(String[] args) {
	Integer nums[]={1,2,3,4};
	String  str[]={"wanf","two","three","wa"};
	if(isln(2,nums))
			System.out.println("2在数组当中");
		
	if(isln("two",str))
		System.out.println("two在数组当中");

	}

}
