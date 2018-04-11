import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*
 *  <applet code ="SampleKey" width =500 height = 100>
 *  </applet>
 */

public class SimpleKey extends Applet implements KeyListener {
String msg="";
int x=10,y=20;
@Override
	public void init() {
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msg+=e.getKeyChar();
		repaint();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("press");
		
		int key = e.getKeyCode();
		switch (key) {
		case  KeyEvent.VK_F1:
			msg+="<0>";
			break;

		default:
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Relesed");

	}
 @Override
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
}
