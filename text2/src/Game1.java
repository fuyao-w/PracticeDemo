import java.awt.Color;

import com.rupeng.game.GameCore;
public class Game1 implements Runnable
{
    public static void main(String[] args)
    {
        GameCore.start(new Game1());
    }
    public void run()
    {
   	
   	   GameCore.setGameTitle("����һ���򵥵���Ϸ��");
    	GameCore.pause(1000);
        GameCore.loadBgView("chaojimalibeijingtu.jpg");
	    GameCore.pause(1000);
	    GameCore.playSound("quanhuangHOT.mp3", true);
	    GameCore.setGameSize(1024, 819);
       /* GameCore.pause(2000);
	    GameCore.alert("123");	    boolean b =   GameCore.confirm("ȷ��Ҫ�˳���Ϸ��");
        System.out.println(b);
	    String s =GameCore.input("���","�������������" );
	    GameCore.alert("���ã�"+s);
    	String s1 =   GameCore.input("", "������Ϸ����Ŀ�");
    	String s2 =   GameCore.input("", "��������Ϸ����ĸ�");
	    int i1= Integer.parseInt(s1);
		int i2= Integer.parseInt(s2);
		GameCore.setGameSize(i1, i2);
		String s3 =   GameCore.input("", "�������������");
		GameCore.setGameTitle("����"+s3+"����Ϸ����");
		*/
    	
    	int selectY=300;
    	int selectx=450;
		int titleNum=0;
		GameCore.createText(titleNum, "��������");
		GameCore.setTextPosition(titleNum, selectx, selectY);
		GameCore.setTextColor(titleNum, Color.YELLOW);
		GameCore.setTextFontSize(titleNum, 60);
		 
		selectY+=70; 
		int singleNum=1;
		GameCore.createText(singleNum, "1-������Ϸ");
		GameCore.setTextPosition(singleNum, selectx, selectY);
		GameCore.setTextColor(singleNum, Color.black);
		selectY+=70; 
		int multiNum=2;
		GameCore.createText(multiNum, "2-������Ϸ");
		GameCore.setTextPosition(multiNum, selectx, selectY);
		GameCore.setTextColor(multiNum, Color.white);
		selectY+=70; 
		int demoNum=3;
		GameCore.createText(demoNum, "3-��Ϸ��ʾ");
		GameCore.setTextPosition(demoNum, selectx,selectY);
		GameCore.setTextColor(demoNum, Color.white);
		GameCore.pause(60000);
    }
}