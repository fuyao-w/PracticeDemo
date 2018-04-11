package wang.java.demo;

import java.util.Arrays;

public class ArrysDemo {

	public static void main(String[] args) {
		int arry[]=new int[10];
		
		
		for(int i=0;i<10;i++)
			arry[i]=-3*i;
		
		System.out.println("原始数组");
		display(arry);
		
		Arrays.sort(arry);
		System.out.println("sort:");
		
		display(arry);
		
		
		Arrays.fill(arry, 2,6,-1);
        System.out.println("after fill:");
        display(arry);

        Arrays.sort(arry);
		System.out.println("sort:");
		
		display(arry);
		
		
		System.out.println("-9所在位置的索引是：");
		int index =Arrays.binarySearch(arry, -9);
		System.out.println(index);
		
		
		
		
		}

	

private static void display(int[] arry1) {
	for(int i:arry1)
		System.out.print(i+" ");
		System.out.println(); 
    }
}
	


