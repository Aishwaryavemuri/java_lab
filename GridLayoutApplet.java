import java.applet.Applet;
import java.awt.*;

/*
<applet code="GridLayoutApplet" width="300" height="200"></applet>
*/

public class GridLayoutApplet extends Applet {
    public void init() {
        setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
    }
}
