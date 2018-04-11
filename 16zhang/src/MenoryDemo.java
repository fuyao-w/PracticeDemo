
public class MenoryDemo {

	public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	long mem1,mem2;
	Integer someints[] = new Integer[1000];
	System.out.println("total menory is: "+r.totalMemory());
	mem1=r.freeMemory();
	System.out.println("Initial free memory: "+mem1);
	r.gc();
	mem1=r.freeMemory();
	System.out.println("free memory after garnage collection :"+mem1);
	for(int i=0;i<1000;i++){
		someints[i]=new Integer(i);
	}
	mem2=r.freeMemory();
	System.out.println("Free memory after allocayion:"+mem2);
	System.out.println("Memory used by allocation:"+(mem1-mem2));
	for(int i=0;i<1000;i++)
		someints[i]=null;
	r.gc();
	mem2=r.freeMemory();
	System.out.println("Free memory after collecting discarded Intrgers:"+mem2);
	}

}
