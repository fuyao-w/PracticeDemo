
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 *  <applet code ="AppletFrame" width =500 height = 100>
 *  </applet>
 */
public class AppletFrame extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5207200881834521464L;
	SampleFrame f= new SampleFrame("A frame wimdow");
	Graphics g;
	public void init() {
		
		f.setSize(300,300);
        f.setVisible(true);
        
        f.setBackground(new Color(255, 100, 100));
     
      
	}
	public void start() {
	f.setVisible(true);

	}
	public void stop() {
		// TODO 自动生成的方法存根
    	f.setVisible(false);
	}
	
	public void paint(Graphics a) {
	
    a.drawString("this is a applet", 10, 40);
    a.drawLine(1, 1, 22, 22);
	}
}
class SampleFrame extends Frame {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6722000184808079371L;



	SampleFrame(String title) {
	super(title);
	MyWindowsAdapter adapter =new  MyWindowsAdapter(this);
	addWindowListener(adapter);
	
}
 
@Override
public void paint(Graphics g) {
	
	
	g.drawLine(1, 1, 22, 22);



}
}
class MyWindowsAdapter extends WindowAdapter{
 SampleFrame sampleframe;
 
 public   MyWindowsAdapter(SampleFrame sampleframe){
	 this.sampleframe=sampleframe;
	 
 }
 
 public void windowClosing(WindowEvent e){
	 sampleframe.setVisible(false);
 }
}
