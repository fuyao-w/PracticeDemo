
import java.applet.*;
import java.awt.*;
/*
 *  <applet code ="Sample" width =500 height = 100>
 *  </applet>
 */



public class Sample extends Applet implements Runnable{
    int state;
	String msg="123456789011";
	Thread t = null;
	volatile boolean StopFlag;
	public void init() {
		
       setBackground(Color.cyan);
       setForeground(Color.red);
	  
	}
	
	@Override
	public void start() {
	t=new Thread(this);
	StopFlag = false;
	t.start();
		
	}
	@Override
	public void run() {
		for(;;){
			try {
				repaint();
				Thread.sleep(250);
				if(StopFlag)
					break;
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	@Override
	public void stop() {
		StopFlag = true;
		t=null;
	}
	
	
	@Override
	public void paint(Graphics g) {
	char ch;
	ch= msg.charAt(0);
	msg=msg.substring(1,msg.length());
	  msg+=ch;
	  g.drawString(msg, 30, 30);
	}
	
	
}
