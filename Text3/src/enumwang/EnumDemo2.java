package enumwang;

public class EnumDemo2 {

	public static void main(String[] args) {
	Apple ap;
	System.out.println("以下是所有的苹果种类");
    Apple allapples[]=Apple.values();
    for(Apple a:allapples)
      System.out.println(a);
    	ap=Apple.valueOf("Winesap");
    	System.out.println("ap contions"+"\t"+ap);
    

	}

}
 enum Apple1{
	Jomathan,GoldenDel,Winesap,Cortland
}