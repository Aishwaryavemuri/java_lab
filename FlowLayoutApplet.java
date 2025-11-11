import java.applet.Applet;
import java.awt.*;

/*
<applet code="FlowLayoutApplet" width="300" height="200"></applet>
*/

public class FlowLayoutApplet extends Applet {
    public void init() {
        setLayout(new FlowLayout());
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
    }
}
