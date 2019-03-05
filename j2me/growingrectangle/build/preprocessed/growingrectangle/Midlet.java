/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growingrectangle;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author shriaas
 */
public class Midlet extends MIDlet {
 MyCanvas canvas; 
    public void startApp() {
        canvas = new MyCanvas();
        Display.getDisplay(this).setCurrent(canvas);
        new Thread(canvas).start();
    }
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
