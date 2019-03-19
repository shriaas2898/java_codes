/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author shriaas
 */
public class Midlet extends MIDlet {
moonrotation ob;
public Midlet(){
    super();
    ob=new moonrotation();
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
