package prcat30;
import java.applet.*;
import java.awt.*;
/*<Applet 
code=Cube.class width=400 height=400>
</applet>*/
public class Cube extends Applet{
    public void paint(Graphics g){
          g.setColor(Color.PINK);
    g.fillRect(100, 100, 100, 100);
    g.drawRect(70,70,100,100);
      g.setColor(Color.BLACK);
      g.drawLine(70,70,100,100);
      g.drawLine(170,70,200,100);
      g.drawLine(70,170,100,200);
     g.drawLine(170,170,200,200);
           g.drawString("CUBE", 150, 230);
    }
    
}
