/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_animation;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author vickr
 */
public class Midlet extends MIDlet {
imagination ob;
public Midlet(){
    super();
    ob=new imagination();
}
    public void startApp() {
        Display.getDisplay(this).setCurrent(ob);
        new Thread(ob).start();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
