
package Pract29;
import java.applet.*;
import java.awt.*;
/*
<applet code="Polygon2"width=300 Height=200>
</applet>
*/
public class Polygon1 extends Applet {
  
        public void paint(Graphics g)
    {
      
          g.setColor(Color.BLUE);
          int x[]={20,30,50,60,40,80};
       int y[]={35,50,410,20,41,60};
    g.drawPolygon(x,y,6);
    
    
   
    }
    }  
