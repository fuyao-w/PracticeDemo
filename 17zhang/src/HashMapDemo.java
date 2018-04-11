import java.util.*;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("王",new Double(123.3));
		hm.put("李", new Double(8123.99));
		
		Set<Map.Entry<String,Double>> set=hm.entrySet();
		
		for(Map.Entry<String,Double> me:set)
			System.out.println(me.getKey()+": "+me.getValue());
			 
		Double Balance=hm.get("王");
		hm.put("王", Balance+1000);
		System.out.println(hm.get("王"));
			
		
	}

}
