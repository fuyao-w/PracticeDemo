import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableDemo {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(3);
	Future<Integer> f1;
	Future<Double> f2;
	Future<Integer> f3;
	System.out.println("开始");
	
	Sum<Integer> sum = new Sum<Integer>(10);
	f1 = es.submit(sum);
			f2 = es.submit(new Hypot(3, 4));
					f3 = es.submit(new Factorial(5));
	
	try {
		//System.out.println(f1.get());
		System.out.println(f2.get(10, TimeUnit.MILLISECONDS));
		System.out.println(f3.get(10, TimeUnit.MILLISECONDS));
	} catch (Exception e) {
		// TODO: handle exception
	}
	es.shutdown();
	System.out.println("完事");
	
}
}

//callable表示有返回值的线程
class Sum<V extends Number> implements Callable<V> {
	
V v,v1;

public Sum(V V) {
   v=V;
}

@Override
public V call() throws Exception {
	 int v1=0;;
	
	for (int i = 1; i <= v.intValue(); i++) {
		v1+=i;
		
	}
	
	
   
	System.out.println(v1);
	return v ;
}
}
class Hypot implements Callable<Double>{
	double side1,side2;
public Hypot(double s1,double s2) {
side1 = s1;
side2 = s2;
}
	@Override
	public Double call() throws Exception {
		
		return Math.sqrt((side1*side1)+(side2*side2));
	}
	
}

class Factorial implements Callable<Integer>{
	int stop;
	public Factorial(int v) {
		stop = v;
		// TODO 自动生成的构造函数存根
	}
	@Override
	public Integer call() throws Exception {
		int fact = 1;
              for (int i = 2; i < stop; i++) {
       fact *=i;				
			}
		return fact;
	}
	
}