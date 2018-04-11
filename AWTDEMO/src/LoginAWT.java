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
	
	Name=new Label("姓名");
	Sex=new  Label("性别");
	
	textname =new TextField("",6);
	
	
	boxgroup =new CheckboxGroup();
	box1=new Checkbox("男",boxgroup,true);
	box2=new Checkbox("女",boxgroup,false);
	
	add(Name);
	add(textname);
	add(Sex);
	                          
	add(box1);
	add(box2);
	
	Hobby=new Label("爱好");
	check1=new Checkbox("电影",false);
	check2=new Checkbox("阅读",false);
	check3=new Checkbox("网络",false);
	check4=new Checkbox("编程",false);
	
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
//		// TODO 自动生成的方法存根
//            new LoginAWT();
//	}

}
