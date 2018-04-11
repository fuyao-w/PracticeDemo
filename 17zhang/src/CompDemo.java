import java.util.*;
public class CompDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>(new MyComp());
		
		ts.add("C");
		ts.add("B");
		ts.add("N");
		
		for(String element:ts)
			System.out.println(element );

	}

}
class MyComp implements Comparator<String>{
	public int compare(String a,String b){
		String astr,bstr;
		astr=a;
		bstr=b;
		return bstr.compareTo(astr);
	}
}