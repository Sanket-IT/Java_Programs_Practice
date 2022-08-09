package Pract29;
import java.applet.*;
import java.awt.*;
/*
<applet code="Rectangle2"width=300 Height=200>
</applet>
*/



public class All  extends Applet {
  
        public void paint(Graphics g)
    {  
         g.setColor(Color.BLUE);
    g.drawLine(0, 0, 60, 60);
    g.drawArc(20, 50, 60, 40, 70, 80);
    g.drawOval(60, 60, 80, 90);
    g.drawRect(60, 60, 50, 80);
    g.drawRoundRect(60, 50,80  , 90 , 70 , 50);
    g.drawString("Hello Friends", 100, 100);
     int x[]={20,30,50,60,40,80};
       int y[]={35,50,410,20,41,60};
    g.drawPolygon(x, y, 50);
 
   
    }
    }  

