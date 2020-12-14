import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void checkBoard(Graphics graphics) {

        int row;
        int col;
        int x, y;

        for (row = 0; row < WIDTH; row++) {

            for (col = 0; col < HEIGHT; col++) {
                x = col * 50;
                y = row * 50;
                if ((row % 2) == (col % 2))
                    graphics.setColor(Color.white);
                else
                    graphics.setColor(Color.black);
                graphics.fillRect(x, y, WIDTH, HEIGHT);
            }

        }

    }

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        checkBoard(graphics);


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