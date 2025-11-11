import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="House" width="300" height="300"></applet>
*/

public class House extends Applet {
    public void paint(Graphics g) {
        g.drawRect(100, 150, 100, 80);      // House body
        g.drawRect(130, 180, 40, 50);       // Door
        int x[] = {90, 150, 210};
        int y[] = {150, 100, 150};
        g.drawPolygon(x, y, 3);             // Roof
    }
}
