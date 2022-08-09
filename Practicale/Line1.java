
package Pract29;
import java.awt.*;
import java.applet.*;
/*
<applet code="Lines"width=300 Height=200>
</applet>
*/
public class Line1 extends Applet {
   
        public void paint(Graphics g)
    {
        g.setColor(Color.PINK);
      g.drawLine(30,30,200,200);
      g.setColor(Color.green);
     g.drawString("Hello", 50,50);
     
    
      g.setColor(Color.RED);
    }
    }

