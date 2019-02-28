/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_move;

import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.*;

/**
 * @author shriaas
 */
public class Midlet extends MIDlet {

    public void startApp() {
        CanvasKeyClass ck = new CanvasKeyClass();
        Display.getDisplay(this).setCurrent(ck);
    }
   
    public void pauseApp() {
    }
   
    public void destroyApp(boolean unconditional) {
    }
}

class CanvasKeyClass extends Canvas{
    int x,y,a,b;
    public CanvasKeyClass()
    {
        super();
       
        x=getWidth()/2-20;
        y=getHeight()/2-30;
        a=x;
        b=y;
    }
   
    public void paint(Graphics g){
        g.setColor(255,255,255);
        g.fillRect(0,0, getWidth(),getHeight());
        g.setColor(123,123,255);
        drawPerson(x, y, g);
        //g.setColor(0, 0, 0);
        //g.drawString(msg, getWidth()/2, getHeight()/2, g.TOP|g.LEFT);
    }
    public void keyPressed(int kcode){
       
       
        switch(getGameAction(kcode)){
            case Canvas.DOWN:
                y+=5;
                break;
            /*case Canvas.LEFT:
                x-=5;
                break;
            */case Canvas.UP:
                y-=5;
                break;
            /*case Canvas.RIGHT:
               
                x+=5;
                break;
              */       
        }
        if(x<0||y<b-30||x+40>getWidth()||y+60>b+60){
            x=a;
            y=b;
   
       
        }
        repaint();
    }
    
    void drawPerson(int x,int y ,Graphics g){
            g.drawArc(a, b, 20, 20, 0, 360);
            g.drawLine(a,y+30,a+10,b+30);//hand1
            g.drawLine(a+10,b+30,a+20,y+30);//hand2
            g.drawLine(a+10,b+20,a+10,b+40);//body
            g.drawLine(a+10,b+40,a,y+60);//leg1
            g.drawLine(a+10,b+40,a+20,y+60);//leg2
        }
}