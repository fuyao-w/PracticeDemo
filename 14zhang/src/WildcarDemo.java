
public class WildcarDemo {

	public static void main(String[] args) {
		Integer inums[]={1,2,3,4,5};
		Stats<Integer> iob =new Stats<Integer>(inums);
		System.out.println("ƽ��ֵ��"+iob.average());
		
		Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
		Stats<Double>dob=new Stats<Double>(dnums);
		System.out.println("ƽ��ֵ��"+dob.average());
		
		System.out.println(iob.sameAvg(dob));
	}

}


class Stats<T extends Number>{    //�н�����
	T[] nums;
	
	public Stats(T[] o) {
		nums=o;
	}
	
	double average(){
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum += nums[i].doubleValue();
			return sum/nums.length;
}
	
	boolean sameAvg(Stats<?> ob){    // ͨ���
		if(this.average()==ob.average())
			return true;
		else
			return false;
	}
}