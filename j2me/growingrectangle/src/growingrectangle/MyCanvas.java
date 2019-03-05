/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growingrectangle;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.*;
import java.util.Random;
/**
 *
 * @author shriaas
 */

public class MyCanvas extends GameCanvas implements Runnable  {
   int x,y,height,width,r,gr,b;
   Random rand;
    MyCanvas(){
       super(true);
       x=getWidth()/2;
       y=getHeight()/2;
       width = 10;
       height =10;
       r=0;
       gr=0;
       b=0;
       rand = new Random();
       
   } 

    public void run() {
        while(true){
            Graphics g= this.getGraphics();
            this.drawScreen(g);
           try{
            Thread.sleep(100);
           
           }
           catch(Exception e){
               
           }
        }
    }
    public void drawScreen(Graphics g){
        g.setColor(r,gr,b);
        g.drawRect(x, y, width, height);
        
        //y+=(y<getHeight()?5:0);
        y=y>0?y-2:getHeight()/2;
        x=x>0?x-2:getWidth()/2;
        height+=4;
        width+=4;
        r=rand.nextInt(255);
        gr=rand.nextInt(255);
        b=rand.nextInt(255);
        flushGraphics();
    }
}
