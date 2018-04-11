	import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		
		Iterator<Integer> o=a.iterator();
		while(o.hasNext()){
			Integer element =o.next();
			System.out.print(element+" ");
			
		}
       System.out.println();
		ListIterator<Integer> ol =a.listIterator();
		while(ol.hasNext()){
			Integer element=ol.next();
			ol.set(element+6);
		
		}
		o=a.iterator();
		while(o.hasNext()){
			Integer element =o.next();
			System.out.print(element+" ");
			
		}
		   
		System.out.println();
		
		while(ol.hasPrevious()){
			Integer element=ol.previous();
			System.out.print(element+" ");
		
		}
		
	}

}
