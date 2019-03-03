/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_point;

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
        TimerCanvas tc = new TimerCanvas();
        MyTask mt = new MyTask(tc);
        Timer t = new Timer();
        t.schedule(mt,0,1);
        Display.getDisplay(this).setCurrent(tc);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}

class TimerCanvas extends Canvas{
    int angle ,x,y,rvalue;
    public TimerCanvas()
    {
        
        super();
        angle=0;
        x=getWidth();
        y=getWidth();
        rvalue=255;
    }
    
    public void paint(Graphics g){
        g.setColor(255,255,255);
        //g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(110, 50, rvalue);
        g.drawArc(255-x,255-y,x,y,0,angle);
    }
    
    
}

class MyTask extends TimerTask{
    TimerCanvas ts;
    public MyTask(TimerCanvas ts){
        this.ts=ts;
    }
    public void run() {
        
        //ts.angle=(ts.angle==360?5:ts.angle+5);
        if(ts.angle==360)
        {
            ts.angle=5;
            ts.x-=2;
            ts.y-=2;
            ts.rvalue-=1;
        }
        ts.angle+=5;
        
        ts.repaint();
    }
    
}