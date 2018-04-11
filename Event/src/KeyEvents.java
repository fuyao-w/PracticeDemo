import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
    <applet code="KeyEvents¡° width=300 height=100>
    </applet>
  */
public class KeyEvents extends Applet
implements KeyListener{
/**
	 * 
	 */  
	private static final long serialVersionUID = -6377367310907259382L;
	
String msg ="";
int X=10,Y=20;
public void init(){
	addKeyListener(this);
}
	
	
	@Override
	public void keyTyped(KeyEvent ke) {
		msg+=ke.getKeyChar();
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
	showStatus("key down");
		int key= ke.getKeyCode();
		
		switch(key)  {
		case KeyEvent.VK_F1:
			msg +="<f1>";
			break;
		case KeyEvent.VK_PAGE_DOWN:
			msg +="<PGDOEN>";
			break;
			
			default:
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		showStatus("key up");
		
	}
	public void paint(Graphics g){
		g.drawString(msg, X, Y);
	}

}
