package fanxing.wang;

public class BoundsDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Integer inums[]={1,2,3,4,5,6};
		Ststs<Integer> iob=new Ststs<Integer>(inums);
		double v=iob.average();
		System.out.println("���"+v);
		Double dnums[]={1.1,2.2,3.3,4.4,5.4};
		Ststs<Double> dob=new Ststs<Double>(dnums);
		double w=dob.average();
		System.out.println("���"+w );
		
		
		
	}

}
class Ststs<T extends Number >{
	T[] nums;
	Ststs(T[] o){
		nums=o;
	}
	double average(){
		double sum=0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
		
	}
	
}