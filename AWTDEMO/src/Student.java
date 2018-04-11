import java.awt.Button;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;



public class Student extends Frame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4613027079731376475L;
	Student s;
	Menu men1=new Menu("控制");
	MenuBar a=new MenuBar();
	MenuItem menui =new MenuItem("关闭");
	Button aa=new Button("关闭");
	public Student() {
		// TODO 自动生成的构造函数存根
		men1.add(menui);
	  a.add(men1);
	 menui.addActionListener(this);
	  setMenuBar(a);
	  setSize(300, 300);
	  setVisible(true);
	  
	  add(aa);
	}
	

	public void actionPerformed(ActionEvent e) {
	    if (e.getSource()==menui) {
	   	this.dispose();
	   	System.out.println("11");
			
		}
		
	}
	


	public static void main(String[] args) {
		
	 Student s =new Student();

	}
	
}
