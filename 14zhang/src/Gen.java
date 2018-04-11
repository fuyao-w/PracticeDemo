
public class Gen<T extends Number> {
T t;

public Gen() {
}
public Gen(T t) {
 this.t=t;

}
	
  private  void same(Gen<?> ob1) {
	  
		System.out.println(this.t.doubleValue()==ob1.t.doubleValue());
		
	

}
private <T extends Number> void add(T t,T o) {
	 System.out.println(t.intValue()+o.intValue());
    //  System.out.println(t.getClass()+ " " + o.getClass());
}
	public static void main(String[] args) {
        Gen<Integer> g =new Gen<Integer>(4); 
        Gen<Double> i = new Gen<Double>(4.0);
        g.add(3.0, 5);
        i.same(g);
     

	}

}
