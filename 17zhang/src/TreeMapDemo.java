import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> tm=new TreeMap<>();
		
		tm.put("Íõ", 1233.34);
		tm.put("Àî", 12323.777);
		
		Set<Map.Entry<String,Double>>  set=tm.entrySet();
		
		for(Map.Entry<String,Double> me:set)
			System.out.println(me.getKey()+": "+me.getValue());

		
		
	}

}
