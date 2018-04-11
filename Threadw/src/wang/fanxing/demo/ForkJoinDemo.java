package wang.fanxing.demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo {

	public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        
        double nums[] = new double[100000];
        
        for (int i = 0; i < nums.length; i++) 
			nums[i]=i;
			
        System.out.println("Ô­Êý×é");
        
        for (int i = 0; i < 10; i++) {
              System.out.print(nums[i]+" ");			
              
		}
        System.out.println();
	    
        SqrtTransfrom task = new SqrtTransfrom(nums, 0, nums.length);
        fjp.invoke(task);
        System.out.println("jieguo");
        for (int i = 0; i <100 ; i++) {
       System.out.format("%.4f", nums[i]);	
       System.out.println();
		}
	}

}

class SqrtTransfrom extends RecursiveAction{

	final int seqThreshold =1000;
	
	double[] data;
	int start,end;
	
	public SqrtTransfrom(double[] vals,int s,int e) {
		data=vals;
		start= s;
		end= e;
	}
	
	@Override
	protected void compute() {
         if((end-start)<seqThreshold){
        	 for (int i = start; i < end; i++) {
				data[i]=Math.sqrt(data[i]);
			}
         }else {
			int middle =(start+end)/2;
			invokeAll(new SqrtTransfrom(data, start, middle),
			          new SqrtTransfrom(data, middle, end));
		}
        	 
	}
	
}