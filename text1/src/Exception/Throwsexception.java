package Exception;

public class Throwsexception {
static void throwone()throws IllegalAccessError{//IllegalAccessError异常属于未经检查的异常，编译器不会检查是否处理或者抛出这类的异常，所以即使去掉
	//throws ill。。。也可以运行程序
	System.out.println("异常方法");
	throw new IllegalAccessError("demo");
}
public static void main(String[] args) {
	try {
		throwone();
		
	}catch(IllegalAccessError e){
		System.out.println("在主函数中抓到异常"+e);
	}
}
}
