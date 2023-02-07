import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class ui {
    private JFrame f;
    private DisplayGraphics g;

    public ui() {
        f = new JFrame("r/place");
        g = new DisplayGraphics();


        f.setSize(1000,1000);
        // f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
