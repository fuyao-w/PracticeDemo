import javax.swing.JFrame;
import javax.swing.JLabel;

public class JframeDemo extends JFrame{
 public JframeDemo(String s) {
	super(s);
	JLabel label=new JLabel("¹þà¶");
	add(label);
	setSize(200,100);
	//setVisible(true);
 }
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4283779012728639764L;

	public static void main(String[] args) {
		new JframeDemo("ÑÝÊ¾´°¿Ú");

	}

}
