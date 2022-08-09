package prcat30;
import java.applet.*;
import java.awt.*;
/*<Applet 
code=Cylinder.class width=400 height=400>
</applet>*/
public class Cylinder extends Applet {
    public void paint(Graphics g){
    g.drawOval(100, 20, 100, 60);
     g.drawOval(100,200, 100, 60);
     g.drawLine(100,50,100,238);
      g.drawLine(200,50,200,238);
      g.drawString("Cylinder", 133, 275);

    }
    
}
