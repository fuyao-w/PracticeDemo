
public class RTTI {

	public static void main(String[] args) {
		X x=new X();
		Y y=new Y();
		Class<?> clobj=x.getClass();
		System.out.println(clobj.getName());
		
		System.out.println(y.getClass().getName());
        Class<?> q=y.getClass();
        System.out.println(q.getName());
        System.out.println(q.getSuperclass());
        clobj=q.getSuperclass();
        System.out.println(clobj);
	}

}
class X{
	int a;
	int b;
}
class Y extends X{
	int c;
}