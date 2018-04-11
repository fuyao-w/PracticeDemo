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
   	
   	   GameCore.setGameTitle("这是一个简单的游戏！");
    	GameCore.pause(1000);
        GameCore.loadBgView("chaojimalibeijingtu.jpg");
	    GameCore.pause(1000);
	    GameCore.playSound("quanhuangHOT.mp3", true);
	    GameCore.setGameSize(1024, 819);
       /* GameCore.pause(2000);
	    GameCore.alert("123");	    boolean b =   GameCore.confirm("确定要退出游戏吗？");
        System.out.println(b);
	    String s =GameCore.input("你好","请输入你的名字" );
	    GameCore.alert("您好！"+s);
    	String s1 =   GameCore.input("", "请输游戏界面的宽");
    	String s2 =   GameCore.input("", "请输入游戏界面的高");
	    int i1= Integer.parseInt(s1);
		int i2= Integer.parseInt(s2);
		GameCore.setGameSize(i1, i2);
		String s3 =   GameCore.input("", "请输入你的名字");
		GameCore.setGameTitle("这是"+s3+"的游戏界面");
		*/
    	
    	int selectY=300;
    	int selectx=450;
		int titleNum=0;
		GameCore.createText(titleNum, "超级玛丽");
		GameCore.setTextPosition(titleNum, selectx, selectY);
		GameCore.setTextColor(titleNum, Color.YELLOW);
		GameCore.setTextFontSize(titleNum, 60);
		 
		selectY+=70; 
		int singleNum=1;
		GameCore.createText(singleNum, "1-单人游戏");
		GameCore.setTextPosition(singleNum, selectx, selectY);
		GameCore.setTextColor(singleNum, Color.black);
		selectY+=70; 
		int multiNum=2;
		GameCore.createText(multiNum, "2-多人游戏");
		GameCore.setTextPosition(multiNum, selectx, selectY);
		GameCore.setTextColor(multiNum, Color.white);
		selectY+=70; 
		int demoNum=3;
		GameCore.createText(demoNum, "3-游戏演示");
		GameCore.setTextPosition(demoNum, selectx,selectY);
		GameCore.setTextColor(demoNum, Color.white);
		GameCore.pause(60000);
    }
}