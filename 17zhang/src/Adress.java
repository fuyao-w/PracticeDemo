import java.util.*;
public class Adress {

	private String name;
	private String stree;
	private String city;
	private String state;
	private String code;
	public Adress( String name,String stree,String city,String state,String code){
		this.name=name;
		this.stree=stree;
		this.city=city;
		this.state=state;
		this.code=code;
	}
	public String toString(){
		return name+"\n"+stree+"\n"+city+"\n"+state+"\n"+code;
	}
	public static void main(String[] args) {
		LinkedList<Adress> ml =new LinkedList<>();
		ml.add(new Adress("��","�Ҹ����","������","������","0000"));
		ml.add(new Adress("����","�Ҵ��긣���","���˹�����","v������","7870000"));
		
		for(Adress element:ml)
			System.out.println(element + "\n");

	}

}
