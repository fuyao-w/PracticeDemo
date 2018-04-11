package wang.fanxing.demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TextDemo {

	public static void main(String[] args) {
 
		A a =new A("A");
		A b =new A("B");
		a.fork();
		b.fork();
	
		a.join();
		b.join();
		
		
//        invoke(a);
//       invoke(b);
		
		

	}

}
class A extends RecursiveTask<Integer>{
	String name;
	 
	public A(String name) {
      this.name=name ;

	}
	@Override
	protected Integer compute() {
		 
		int sum =0;
		System.out.println(name +"ִ��");
		
	
			for (int i = 0; i <10; i++) {
				sum +=i;
			    
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(name+"ִ��" +i+"��");
	
	}
			A a =new A("A");
			A b =new A("B");
			return sum;
	
}
}