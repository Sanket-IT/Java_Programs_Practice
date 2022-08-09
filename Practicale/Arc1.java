
package Pract29;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="Polygon2"width=300 Height=200>
</applet>
*/
public class Arc1  extends Applet {
  
        public void paint(Graphics g)
    {
      
          g.setColor(Color.BLUE);
          g.drawArc(100,200,100, 150,250, 300);
    
   
    }
    }  
