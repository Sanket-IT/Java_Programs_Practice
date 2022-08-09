
package prcat30;
import java.applet.*;
import java.awt.*;
/*<Applet 
code=Cone.class width=400 height=400>
</applet>*/
public class Cone extends Applet{
      public void paint(Graphics g){
      g.drawOval(120,130, 120, 100);
      g.drawLine(180,0, 119, 178);
      
       g.drawLine(180,0,240,172);
       g.drawString("Cone",160 ,250);
      }
}
