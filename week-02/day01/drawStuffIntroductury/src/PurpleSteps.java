import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
// Reproduce this:
// [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]


        /* for (int i = 0; i < 19; i++) {
            Color myPurple = new Color(153,102,204);
            graphics.setColor(myPurple);

            graphics.fillRect(setMyRect, setMyRect, sizeMyRect, sizeMyRect);
            setMyRect += 10;

        }  */

        int setMyRect = 10;
        int sizeMyRect = 10;

        Color myPurple = new Color(153,102,204);
        graphics.setColor(myPurple);

        for (int i = 0; i < 6; i++) {

            graphics.drawRect(setMyRect, setMyRect, sizeMyRect, sizeMyRect);
            setMyRect = setMyRect + i * 10;
            sizeMyRect =  sizeMyRect + i * 10;
            if (i == 4) {
                setMyRect += 10;
            }

        }
        
        
        
        

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}