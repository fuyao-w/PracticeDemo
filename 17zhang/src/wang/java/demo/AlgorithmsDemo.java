package wang.java.demo;
import java.util.*;
public class AlgorithmsDemo {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		Comparator<Integer> r=Collections.reverseOrder();
		Collections.sort(ll,r);
		
		
		System.out.println("List sort in reverse");
		for(int i:ll)
			System.out.print(i+" ");
		System.out.println();
		
		Collections.shuffle(ll);
		
		System.out.println("List shuffled");
		for(int i:ll)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("最小值"+Collections.min(ll));
		System.out.println("最大値"+Collections.max(ll));
		
	}

}
