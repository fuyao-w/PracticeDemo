import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Windowstest extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2761722374010562331L;

	
	
	
	
	JButton button1,button2;
	JframeDemo window;
	public Windowstest(String s) {
		super(s);
		
		setLayout(new GridLayout(1, 2));
		button1 =new JButton("显示");
		button2 =new JButton("隐藏");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		add(button1); add(button2);
		setSize(250,100);
		setVisible(true);
		window=new JframeDemo("演示");
		
	}
	public static void main(String[] args) {
		Windowstest  w =new Windowstest("总窗口");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==button1)
			 window.setVisible(true);
		  else 
			  window.dispose();
		  
		
	}

}
