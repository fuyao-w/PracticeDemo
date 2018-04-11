package wang.fanxing.demo;

public class WileCardDemo {

	public static void main(String[] args) {
         Integer inums[]={1,2,3,4,5};
         Stats<Integer> iob = new Stats<>(inums);
         double v = iob.average();
         System.out.println(v);
         Double dnums[]={1.2,2.2,3.3,4.4,5.5};
         Stats<Double> dob = new Stats<>(dnums);
         double w = dob.average();
         System.out.println(w);
         
         if (iob.sameAvg(dob)) {
        	 System.out.println("相等");
        	 
			
		}else {
			System.out.println("不相等");
		}
	}

}
class Stats <T extends Number>{
	T[] nums;
	public Stats(T[] o) {
      nums=o;
	}
	
	double average(){
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i].doubleValue();
			
		}
		return sum;
	}
	boolean sameAvg(Stats<?> ob){
		if(average()== ob.average())
			return true;
		return false;
		
	}
 }

