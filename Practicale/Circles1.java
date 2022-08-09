
package Pract29;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<applet code="Circle1"width=300 Height=200>
</applet>
*/



public class Circles1  extends Applet {
  
        public void paint(Graphics g)
    {
        g.drawString("HEllo", 50, 50);
        
          g.setColor(Color.BLUE);
     g.fillOval(200, 200, 200, 200);
   
    }
    }  
