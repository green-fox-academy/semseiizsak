
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
public class tipsForChecker {

    public static void paint(Graphics g) {

        int row;   // Row number, from 0 to 7
        int col;   // Column number, from 0 to 7
        int x, y;   // Top-left corner of square

        for (row = 0; row < 8; row++) {

            for (col = 0; col < 8; col++) {
                x = col * 20;
                y = row * 20;
                if ((row % 2) == (col % 2))
                    g.setColor(Color.red);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }

        } // end for row

    }  // end paint()




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        PurpleSteps.ImagePanel panel = new PurpleSteps.ImagePanel();
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
} */