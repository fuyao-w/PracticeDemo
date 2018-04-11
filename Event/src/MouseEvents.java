import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
    <applet code="MouseEvents¡° width=300 height=100>
    </applet>
  */

public class MouseEvents extends Applet
implements MouseListener,MouseMotionListener{
/**
	 * 
	 */
	private static final long serialVersionUID = -6203875216365648179L;
String msg="";
int mouseX=0,mouseY=0;


public void init(){
	addMouseListener(this);
    addMouseMotionListener(this);
}

public void mouseClicked(java.awt.event.MouseEvent me){
	mouseX=0;
	mouseY=10;
	msg="mouseClicked";
	repaint();
}

public void mouseEntered(java.awt.event.MouseEvent me) {
	mouseX=0;
	mouseY=10;
	msg="Mouse Entered";
	repaint();

}

public void mouseExited(java.awt.event.MouseEvent me){
	
	mouseX=0;
	mouseY=10;
	msg="Mouse Exited";
	repaint();

}
public void mousePressed(java.awt.event.MouseEvent me){
	
	mouseX=0;
	mouseY=10;
	msg="down";
	repaint();

}
public void mouseReleased(java.awt.event.MouseEvent me){
	
	mouseX=0;
	mouseY=10;
	msg="up";
	repaint();

}
public void mouseDragged(java.awt.event.MouseEvent me){
	
	mouseX=0;
	mouseY=10;
	msg="*";
	showStatus("Dragging mouse at "+mouseX+","+mouseY);
	repaint();

}
public void mouseMoved(java.awt.event.MouseEvent me){
	
	
	showStatus("Dragging mouse at "+me.getX()+","+me.getY());
	repaint();

}

public void paint(Graphics g){
	g.drawString(msg, mouseX, mouseY);
}





}
