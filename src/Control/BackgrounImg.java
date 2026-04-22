package Control;

import javax.swing.*;
import java.awt.*;

public class BackgrounImg extends JPanel {

    private Image img;

    public BackgrounImg() {
        img = new ImageIcon(getClass().getResource("cometa.png")).getImage();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
