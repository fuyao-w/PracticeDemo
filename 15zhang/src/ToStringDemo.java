
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
      Box B=new Box(10,12,14);
      String s="Box B:"+B;
      System.out.println(B);
      System.out.println(s);
	}

}
class Box{
	double width;
	double height;
	double depth;
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public String toString(){
		return "Dimensions are "+width+" by "+height+" by "+depth+" .";//�����ӱ��ʽ����println()�У����Զ�����toString����
	}
}