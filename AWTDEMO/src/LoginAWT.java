import java.awt.*;

public class LoginAWT extends Frame{
/**
	 * 
	 */
	private static final long serialVersionUID = 4416456136032878651L;
Checkbox box1,box2;
CheckboxGroup boxgroup;
Checkbox check1,check2,check3,check4;
Label Name,Sex,Hobby;

TextField textname;

public LoginAWT(){
	setLayout(new FlowLayout());
	
	Name=new Label("����");
	Sex=new  Label("�Ա�");
	
	textname =new TextField("",6);
	
	
	boxgroup =new CheckboxGroup();
	box1=new Checkbox("��",boxgroup,true);
	box2=new Checkbox("Ů",boxgroup,false);
	
	add(Name);
	add(textname);
	add(Sex);
	                          
	add(box1);
	add(box2);
	
	Hobby=new Label("����");
	check1=new Checkbox("��Ӱ",false);
	check2=new Checkbox("�Ķ�",false);
	check3=new Checkbox("����",false);
	check4=new Checkbox("���",false);
	
	add(Hobby);
	add(check1);
	add(check2);
	add(check3);
	add(check4);
	add(new Label(""));
	add(new Label(""));
	
	setSize(260, 100);
	
	setVisible(true);
	
}
	
//public static void main(String[] args) {
//		// TODO �Զ����ɵķ������
//            new LoginAWT();
//	}

}
