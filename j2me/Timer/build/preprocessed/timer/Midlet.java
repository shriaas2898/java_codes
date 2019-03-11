/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author shriaas
 */
public class Midlet extends MIDlet {

    public void startApp() {
        TimerCanvas tc = new TimerCanvas();
        MyTask mt = new MyTask(tc);
        Timer t = new Timer();
        t.schedule(mt,0,150);
        Display.getDisplay(this).setCurrent(tc);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}

class TimerCanvas extends Canvas{
    int x1,y1;
    public TimerCanvas()
    {
        
        super();
        x1=5;
        y1=10;
     
    }
    
    public void paint(Graphics g){
        g.setColor(255,255,255);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(255, 0, 0);
        g.drawLine(5,5,x1,y1);
    }
    
    
}

class MyTask extends TimerTask{
    TimerCanvas ts;
    public MyTask(TimerCanvas ts){
        this.ts=ts;
    }
    public void run() {
        
        ts.y1+=10;
        ts.repaint();
    }
    
}