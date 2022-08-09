
package prcat30;
import java.applet.*;
import java.awt.*;
/*<Applet 
code=Circle.class width=400 height=400>
</applet>*/
public class Circle extends Applet {
  public void paint(Graphics g) {
      
      g.drawRect(10,10, 80, 80);
      g.drawOval(10,10, 80, 80);
      g.drawString("Circle inside squre",00,110);
      g.drawOval(150,8,118,118);
      g.drawRect(170,26, 80, 80);
      g.drawString("squre inside circle", 150, 143);
}
}


    
    
