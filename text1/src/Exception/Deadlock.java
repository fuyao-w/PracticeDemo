 package Exception;

public class Deadlock implements Runnable {
A a =new A();
B b= new B();
Deadlock(){
	Thread.currentThread().setName("���߳�");
	Thread t= new Thread(this ,"���߳�");
	t.start();
	a.foo(b);
	System.out.println("�������߳�");
}
public void run() {
	// TODO �Զ����ɵķ������
    b.bar(a);
    System.out.println("���ظ��߳�");
}
public static void main(String[] args) {
	new Deadlock();
}

}
class A{
	synchronized void foo(B b){
		String name =Thread.currentThread().getName();
		System.out.println(name+"entered A.foo");
		try{
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println(name+" trying to call B.last");
		b.last();
		
	}
	synchronized void last(){
		System.out.println("INSIDE a.last");
	}
}
class B{
	synchronized void bar(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name +"enteredB.bar");
		
	
	try{
		Thread.sleep(1000);
		
	}catch(Exception e){
		e.printStackTrace();
	}
     System.out.println(name+" trying to call A.last");
     a.last();
	}
	synchronized void last(){
		System.out.println("INSIDE a.last");
	}
	}