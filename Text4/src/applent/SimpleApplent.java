package applent;

import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code ="SimpleApplent" width=20 height=60>
Ballet
 */
public class SimpleApplent extends Applet {
/**
	 * 
	 */
	private static final long serialVersionUID = -8508022541884896088L;

public void paint(Graphics g){
	g.drawString("这是一个简单的Applent程序", 50, 50);
}
}
