import java.awt.Dimension;
import com.rupeng.game.GameCore;
 
public class Zhuang4Jiao implements Runnable
{
 
    public static void main(String[] args)
    {
        GameCore.start(new Zhuang4Jiao());
    }
 
    @Override
    public void run()
    {
        int ball=0;
        GameCore.createSprite(ball, "ball1");
        GameCore.playSpriteAnimate(ball, "rotate", true);
        GameCore.setSpritePosition(ball, 100, 0);
         
        int vx=2;//横向速度
        int vy=1;//纵向速度
        int x=0;
        int y=200;
        int t=1;
        Dimension gameSize = GameCore.getGameSize();//游戏窗口大小
        for(;;)
        {
            x=x+vx*t;
            y=y+vy*t;
            GameCore.setSpritePosition(ball, x, y);
            GameCore.pause(10);
            //if(x<=0||x>=300)
            if(x<=0||x>=gameSize.width-20)
            {
                vx=-vx;
            }
            //if(y<=0||y>=300)
            if(y<=0||y>=gameSize.height-50)
            {
                vy=-vy;
            }          
        }
    }
}