import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(1);
		a2.add(2);
		a2.add(3);
        System.out.println(a2);
        
        Integer ia[]=new Integer[a2.size()];
      
        ia=a2.toArray(ia);
        int sum =0;
        for(int i:ia)sum+=i;
        	System.out.println(sum); 
	}

}
