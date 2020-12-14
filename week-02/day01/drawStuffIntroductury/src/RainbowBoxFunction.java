import javax.swing.*;
import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static Color randomColor() {
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        Color color = new Color(Red, Green, Blue);
        return color;
    }

    public static void randomSquare(int width, Graphics graphics) {


        int numberOfSquares = 32;
        int width2 = width;



        for (int j = 0; j < numberOfSquares; j++) {
            graphics.setColor(randomColor());
            width = width - 10;
            graphics.fillRect(((WIDTH / 2) - (width / 2)), ((HEIGHT / 2) - (width / 2)), width, width);
        }
    }


    public static void mainDraw(Graphics graphics) {
// Create a square drawing function that takes 3 parameters:
// The square size, the fill color, graphics
// and draws a square of that size and color to the center of the canvas.
// Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        randomSquare(320, graphics);

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