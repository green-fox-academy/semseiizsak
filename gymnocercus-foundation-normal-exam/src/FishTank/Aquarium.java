package FishTank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> fishes = new ArrayList<>();

    /*public Aquarium(String name, int weight, String color) {
        super(name, weight, color);
    } */

    public void addFish(Fish fish){
        fishes.add(fish);
    }

    public void feedAll(){
        for (int i = 0; i < fishes.size(); i++) {
           fishes.get(i).feed();
        }
    }

    public void removeFish(){
        for (int i = 0; i < fishes.size(); i++) {
            if(fishes.get(i).getWeight() >= 11){
                fishes.remove(i);
            }
        }
    }

    public void getStatus(){
        for (int i = 0; i < fishes.size(); i++) {
            System.out.println(fishes.get(i).status());
        }
    }
}
