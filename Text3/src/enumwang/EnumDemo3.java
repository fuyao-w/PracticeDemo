package enumwang;

public class EnumDemo3 {

	public static void main(String[] args) {
	
	Apple b[]=Apple.values();
	System.out.println("Winesap cost"+Apple.Winesap.getprice());
	System.out.println("����ƻ���۸�");
	for(Apple aa :b)
		System.out.println(aa+"  "+"cost"+" "+aa.getprice());

	}

}
enum Apple{
	Jomathan(11),GoldenDel(22),Winesap(23),Cortland(44);
	
	private int price; 
	Apple (int p)
	{
		 price =p;
		 }
	
		int getprice(){
			return price;
		}
	
}