
import java.awt.*;

import javax.swing.*;
public class Checkpanels extends JFrame{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7030158114213560883L;

	checkboxpanel panel1,panel2,panel3,panel4;
	public Checkpanels(){
		setLayout(new GridLayout());
		panel1=new checkboxpanel();
		panel2 =new checkboxpanel();
		panel3 =new checkboxpanel();
		panel4 =new checkboxpanel();
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		setSize(500, 400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Checkpanels();

	}

}

class checkboxpanel extends JPanel{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -1572572783649060472L;
		JCheckBox check1,check2,check3,check4;
		public checkboxpanel() {
			
	       	setLayout(new GridLayout(2, 2));
	       	check1=new JCheckBox("1");  add(check1);
	       	check2=new JCheckBox("2");  add(check2);
	       	check3=new JCheckBox("3");  add(check3);
	     	check4=new JCheckBox("4");  add(check4);
	      
	  
	       	
		}

		public static void main(String[] args) {
			

		}

	}
	
