import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static Color randomColor (){
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        Color color = new Color(Red, Green, Blue);
        return color;
    }



    public static void randomRectangle(int xCord, int yCord, int width, int height, Graphics graphics){
        graphics.fillRect(xCord, yCord, width, height);

    }

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random = new Random();



        for (int i = 0; i < 4; i++) {
            int resultX = random.nextInt(240);
            int resultY = random.nextInt(240);
            int resultW = random.nextInt(160);
            int resultH = random.nextInt(160);

            graphics.setColor(randomColor());
            randomRectangle(resultX, resultY, resultW, resultH, graphics);
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
