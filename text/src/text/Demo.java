package text;


import java.util.Scanner;

public class Demo {

	 

	public static void main(String[] args) {
		
			user u=new user();
			
			 Scanner u1 =new Scanner(System.in);
			System.out.println("请输入登录名");
		    u.name=u1.nextLine();
		    u.setName(u.name);
			System.out.println("请输入密码");
			u.password=u1.nextLine();
		    u.setName(u.password);
		    try {
				u.variety(u.name, u.password);
			} catch (AuthorlogExcption e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
}
