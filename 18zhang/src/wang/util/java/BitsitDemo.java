package wang.util.java;

import java.util.BitSet;

public class BitsitDemo {

	
	public static void main(String[] args) {
	BitSet bits1=new BitSet(16);
	BitSet bits2=new BitSet(16);
	
	for(int i=0;i<16;i++){
		if(i%2==0)bits1.set(i);
		if((i%5)!=0)bits2.set(i);
	}
		System.out.println("��ʼ������ bits1");
		System.out.println(bits1);
		System.out.println("��ʼ������ bits1");
		System.out.println(bits2);

		bits2.and(bits1);
		System.out.println("AND����\n"+bits2);
		
		bits2.or(bits1);
		System.out.println("OR����\n"+bits2);
	
	}

}
