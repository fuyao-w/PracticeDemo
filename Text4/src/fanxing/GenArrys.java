package fanxing;

public class GenArrys {
Integer n[]={1,2,3,4,5};

	Gen33<Integer> iob=new Gen33<Integer>(5,n);
//	Gen33<Integer> iob[]=new Gen33<Integer>[];���ܴ����ض����͵ķ�����������
	Gen33<?> nums[]=new Gen33<?>[10];
}
class Gen33<T extends Number>{
T obl;
T[] vals;//����ָ��T���͵����������ǺϷ���
public Gen33(T o,T[] nums) {
	this.obl=o;
	nums=vals;
}
//vals =new T[10]; ����ʵ����Ԫ������Ϊ�������͵����顢�������ǲ�����T,�������޷�֪��ʵ�ʴ���ʲô���͵�����


}