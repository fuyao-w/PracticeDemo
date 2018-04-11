import java.util.*;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("��",new Double(123.3));
		hm.put("��", new Double(8123.99));
		
		Set<Map.Entry<String,Double>> set=hm.entrySet();
		
		for(Map.Entry<String,Double> me:set)
			System.out.println(me.getKey()+": "+me.getValue());
			 
		Double Balance=hm.get("��");
		hm.put("��", Balance+1000);
		System.out.println(hm.get("��"));
			
		
	}

}
