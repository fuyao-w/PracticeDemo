package wang.java.demo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> tm=new TreeMap<String,Double>(new TComp());
		tm.put("john doe", new Double(2323.23));
		tm.put("tom smith", new Double(222.2333));
		tm.put("jane baker", new Double(123.554));
		tm.put("ralph smith", new Double(5656.7));
		
		Set<Map.Entry<String, Double>>set= tm.entrySet();
		
		for(Map.Entry<String, Double> me :set)
			System.out.println(me.getKey()+" "+me.getValue());
		
		
		
	}

}
class TComp implements Comparator<String>{
	@Override
	public int compare(String a,String b){
		int i,j,k;
		String astr,bstr;
		astr=a;
		bstr=b;
		
		i=astr.lastIndexOf(' ');
		j=bstr.lastIndexOf(' ');
		
		k=astr.substring(i).compareTo(bstr.substring(j));
		
		if(k==0)
			return astr.compareTo(bstr);
		else
			return  k;
		
	}


}