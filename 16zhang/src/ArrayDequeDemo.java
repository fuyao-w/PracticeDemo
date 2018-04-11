import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> aa=new ArrayDeque<>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		while(aa.peek()!=null){
			System.out.print(aa.pop()+"   ");
			
		}
		System.out.println();
	}

}
