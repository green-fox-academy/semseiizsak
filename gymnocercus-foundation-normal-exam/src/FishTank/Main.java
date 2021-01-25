package FishTank;

import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Clownfish clownfish = new Clownfish();
        Tang tang = new Tang();
        Kong kong = new Kong();

        aquarium.addFish(clownfish);
        aquarium.addFish(tang);
        aquarium.addFish(kong);

        aquarium.feedAll();
        aquarium.getStatus();
    }
}
