package wanderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Resource {
    private HashMap<CellType, BufferedImage> images = new HashMap<>();

    public Resource() {
        images.put(CellType.FLOOR, loadImage("/Users/semseiizsak/Documents/greenfox/semseiizsak/week-05/wanderer-java/img/floor.png"));
        images.put(CellType.WALL, loadImage("/Users/semseiizsak/Documents/greenfox/semseiizsak/week-05/wanderer-java/img/wall.png"));
        images.put(CellType.HERO, loadImage("/Users/semseiizsak/Documents/greenfox/semseiizsak/week-05/wanderer-java/img/hero-down.png"));
    }

    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println("Image cannot be found at: " + path);
            System.exit(2);
        }

        return null;
    }

    public BufferedImage getImage(CellType key) {
        return images.get(key);
    }
}