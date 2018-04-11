import java.util.*;
public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<>();
		ll.add("f");
		ll.add("e");
		ll.add("c");
		ll.add(1,"g");
		System.out.println(ll);
		ll.remove("f");
		ll.remove(2);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		String val=ll.get(0);
		System.out.println(val);
		System.out.println(ll.set(0, "change"));
		System.out.println(ll);

	}

}
