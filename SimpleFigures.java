import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SimpleFigures" width="300" height="300"></applet>
*/

public class SimpleFigures extends Applet {
    public void paint(Graphics g) {
        g.drawRect(30, 30, 100, 60);   // Rectangle
        g.drawOval(160, 30, 80, 80);   // Circle
        g.drawLine(30, 120, 240, 120); // Line
    }
}
