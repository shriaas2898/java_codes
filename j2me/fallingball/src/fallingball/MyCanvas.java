/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallingball;

/**
 *
 * @author shriaas
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.*;
import java.util.Random;
/**
 *
 * @author shriaas
 */
public class MyCanvas extends GameCanvas implements Runnable  {
   int xc,yc,xr,yr,points;
   Random rand;
    MyCanvas(){
       super(true);
       xc=getWidth()/2;
       yc=2;
       xr=getWidth()/2;
       yr=getHeight()-15;
       rand = new Random();
       points=0;
   } 

    public void run() {
        while(true){
            Graphics g= this.getGraphics();
            this.drawScreen(g);
            this.input();
           try{
            Thread.sleep(50);
           
           }
           catch(Exception e){
               
           }
        }
    }
    public void drawScreen(Graphics g){
        g.setColor(0,0,0);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(255, 255, 255);
        g.fillArc(xc, yc, 20, 20, 0, 360);
        g.setColor(0,0,255);
        g.fillRect(xr, yr, 50, 5);
        g.drawString("Points="+points, 0, 0, g.TOP | g.LEFT);
//y+=(y<getHeight()?5:0);
        xc=(rand.nextInt(2)==0?xc-2:xc+2);
        yc+=2;
        if((yc+20>yr))
        {if(xc>=xr&&xc>xr)
        {
         points+=1;}
         xc=getWidth()/2;
         yc=2;
        }
                
        
        flushGraphics();
    }
    private void input(){
        int ks =getKeyStates();
        if((ks& LEFT_PRESSED)!=0&&xr>0){xr-=5;}
        if((ks& RIGHT_PRESSED)!=0&&xr<getWidth()){xr+=5;}
        
        
        
    }
}