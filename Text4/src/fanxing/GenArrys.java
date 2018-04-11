package fanxing;

public class GenArrys {
Integer n[]={1,2,3,4,5};

	Gen33<Integer> iob=new Gen33<Integer>(5,n);
//	Gen33<Integer> iob[]=new Gen33<Integer>[];不能创建特定类型的泛型引用数组
	Gen33<?> nums[]=new Gen33<?>[10];
}
class Gen33<T extends Number>{
T obl;
T[] vals;//声明指向T类型的数组引用是合法的
public Gen33(T o,T[] nums) {
	this.obl=o;
	nums=vals;
}
//vals =new T[10]; 不能实例化元素类型为参数类型的数组、在运行是不存在T,编译器无法知道实际创建什么类型的数组


}