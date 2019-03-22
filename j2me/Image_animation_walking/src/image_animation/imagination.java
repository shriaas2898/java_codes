/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_animation;
import java.io.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;



/**
 *
 * @author vickr
 */
public class imagination extends GameCanvas implements Runnable {
    int count;
    int delay;
    int cutX, cutY;
    Image img;
    Sprite sp;
    int ks;
    boolean started = false;
   public  imagination(){
        super(true);
        count=0;
        delay=400;
        cutX=0;
        cutY=0;
        img=null;
        
        try{
            InputStream ss=this.getClass().getResourceAsStream("walk.jpg");
            img=Image.createImage(ss);
            int fw= img.getWidth()/4;
            int fh= img.getHeight();
            sp= new Sprite(img,fw,fh);

            
        } catch(Exception e){e.printStackTrace();}
        
            
        }
       public void run(){
           Graphics g=this.getGraphics();
           while(true){
                input();
                sp.setFrame(count);
                count++;
           if(count>3){ count =0;   }
           drawScreen(g);
           try{
               Thread.sleep(delay);
           } catch(Exception e){e.printStackTrace();}
           
           }
    }
       
       public void input(){
           int ks= getKeyStates();
           sp.setFrame(0);
           
           //LEFT
           if((ks & LEFT_PRESSED)!=0){
               cutX=cutX-8;
               sp.setFrame(0);
               sp.setTransform(Sprite.TRANS_MIRROR);
           }
           //RIGHT
           if((ks & RIGHT_PRESSED)!=0)
           if (cutX +5 < this.getWidth()){
               cutX=cutX+8;
               sp.setFrame(0);
               sp.setTransform(Sprite.TRANS_NONE);
           }
        
       }
    public void drawScreen(Graphics g){
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        sp.setPosition(cutX, cutY);
        sp.paint(g);
        flushGraphics();
    }
}
