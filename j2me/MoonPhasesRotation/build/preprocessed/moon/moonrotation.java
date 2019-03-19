/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon;
import java.io.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;


/**
 *
 * @author shriaas
 */
public class moonrotation extends GameCanvas implements Runnable {
    int count;
    int delay;
    int cutX, cutY;
    Image img;
    Sprite sp;
                int x,y,a,b,angle,point,hel,flag=0;
                
   public moonrotation(){
        super(true);
        count=0;
        delay=400;
        cutX=getWidth()/2;
        cutY=getHeight()/2;
        img=null;
        a=cutX;
        b=cutY;
        
        try{
            InputStream ss=this.getClass().getResourceAsStream("mo.jpg");
            img=Image.createImage(ss);
            int fw= img.getWidth()/4;
            int fh= img.getHeight();
            sp= new Sprite(img,fw,fh);
        } catch(Exception e){e.printStackTrace();}
        
            
        }
       public void run(){
           Graphics g=this.getGraphics();
            this.drawScreen(g);
            this.input(g);
           while(true){
           sp.setFrame(count);
           count++;
           if(count>3){ count =0;   }
           drawScreen(g);
           try{
               Thread.sleep(delay);
           } catch(Exception e){e.printStackTrace();}
           
           }
    }
    public void drawScreen(Graphics g){
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        
        g.setColor(0, 0, 255);
        x = (int) (a + ((80)*Math.cos(angle)));
        y = (int) (b + ((80)*Math.sin(angle)));
        
        angle = (angle==360?0:angle+1);
        drawCircle(a, b, 5, g);
         
        sp.setPosition(x, y);
        sp.paint(g);
        
        flushGraphics();
    }
    public void input(Graphics g)
    {
        
        int ks=getKeyStates();
        if((ks &FIRE_PRESSED) !=0)
        {
           
           flag=1;
           
        }
    }
    
     void drawCircle(int x,int y,int size,Graphics g)
     {
            g.fillArc(a, b, 6*size, 6*size, 0, 360);
            
     }
     
}
