package wang.fanxing.demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecurTaskDemo {

	public static void main(String[] args) {
         ForkJoinPool fjp = new ForkJoinPool();//可以规定让线程在多个处理器上运行，由自己控制
        double[] nums =new double[5000];
        
        for (int i = 0; i < nums.length; i++) 
			nums[i] = (double)(((i%2)==0)? i : -i);
			
        Sum task = new Sum(nums, 0, nums.length);
        
        double summation = fjp.invoke(task);
        
        System.out.println(summation);
		
	}

}
class Sum extends RecursiveTask<Double>{
	final int seqThresHold = 500;
	double[] data;
	int start ,end;
	
	public Sum( double[] vals, int s,int e) {
            data =vals ;
            start =s;
            end= e;
	}
	
	@Override
	protected Double compute() {
         double sum=0;
         if((end-start)< seqThresHold){
        	 for (int i = start; i <end; i++) sum+= data[i];				
			}
         else {
			int middle= (start+end)/2;
			
			Sum subTaskA = new Sum(data, start, middle);
			Sum subTaskB = new Sum(data, middle, end);
			
            subTaskA.fork();
			//subTaskB.fork();
			sum = subTaskA.join()+subTaskB.invoke();
			// invoke 方法是将JION FORK合并打i一个调用中  ，但是这和方法会造成阻塞不能异步执行    execute方法也可以起到异步执行的效果
			//Fork方法启动任务时其他的任务不必等待其完成就可以运行， Join 方法获取每个人物的执行结果
			//观察TextDemo可以了解
			}
        	 
		return sum;
	}
}