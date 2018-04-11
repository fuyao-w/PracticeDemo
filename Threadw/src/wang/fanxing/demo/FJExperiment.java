package wang.fanxing.demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class FJExperiment {

	public static void main(String[] args) {
      int pLevel;//并行级别
      int threshold;//临界值
      
      if (args.length!=2) {
		return;
	}
      pLevel = Integer.parseInt(args[0]);
      threshold=Integer.parseInt(args[1]);
      
      ForkJoinPool fjp =new ForkJoinPool(pLevel);
      
      double[] nums = new double[100000];
      
      for (int i = 0; i < nums.length; i++) 
           nums[i] = (double)i;		
      
      Transform task =new Transform(nums, 0, nums.length, threshold);
      
      long beginT =System.nanoTime();
      
      fjp.invoke(task);
      long endT =System.nanoTime();
	
      System.out.println("并行级别 "+ pLevel);
      System.out.println("临界值 "+ threshold);
      
      System.out.println("运行时间 " +(endT-beginT)+" ns");
     int A=fjp.getParallelism();
     Runtime B = Runtime.getRuntime();
     int b1= B.availableProcessors();
      System.out.println(A);
      System.out.println(b1);
	}

}
class Transform  extends RecursiveAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1090626293065730636L;
	int seqThreshold; //临界值
	double[] data;
    int start, end;
    public Transform(double[] vals , int s, int e,int t ) {
           data=vals;
           start = s;
           end= e;
           seqThreshold =t;
    }
    
	@Override
	protected void compute() {
        if ((end-start)<seqThreshold) {
			for (int i = start; i < end; i++) {
               if(data[i]%2==0)
            	   data[i]=Math.sqrt(i);
               else
            	   data[i]=Math.cbrt(i);
			}
		}		
        else {
			int middle=(start+end)/2;
			
			invokeAll(new Transform(data, start, middle, seqThreshold),
					  new Transform(data, middle, end, seqThreshold));
		}
	}
}