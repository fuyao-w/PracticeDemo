import java.util.TreeSet;

public class TrssSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> lo=new TreeSet<Integer>();
        lo.add(2);
        lo.add(5);
        lo.add(6);
        lo.add(1);
        System.out.println(lo);
        System.out.println(lo.subSet(1,5));
	}

}
