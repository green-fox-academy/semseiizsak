package wanderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Main extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    private Resource resource;
    private Board board;
    private final static int IMAGE_SIZE = 72;
    private final static int BOARD_SIZE = 10;
    private static int leftInset;
    private static int topInset;

    public Main() {
        /*testBoxX = 300;
        testBoxY = 300;*/

        this.resource = new Resource();
        this.board = new Board(BOARD_SIZE);
        setPreferredSize(new Dimension(BOARD_SIZE * IMAGE_SIZE, BOARD_SIZE * IMAGE_SIZE));
        setVisible(true);

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    /*@Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage image = new PositionedImage("yourimage.png", 300, 300);
        image.draw(graphics);
    }*/

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        board.draw(graphics, resource, IMAGE_SIZE);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Main board = new Main();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        } 
        // and redraw to have a new picture with the new coordinates
        repaint();

    }

}
