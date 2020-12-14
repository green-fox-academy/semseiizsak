import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class GoToCenter {
    public static void drawsLine (int xCord, int yCord, Graphics graphics) {
        graphics.drawLine(xCord, yCord, (WIDTH/2), (HEIGHT/2));
    }

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.MAGENTA);

        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            int resultX = (320);
            int resultY = random.nextInt(320);
            drawsLine(resultX, resultY, graphics);

        }



        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

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
