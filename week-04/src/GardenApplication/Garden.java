package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden{

    private List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant p) {
        plants.add(p);
    }


    public void wateringStatus() {
        for (Plant p : plants) {
            p.wateringStatus();
        }
    }

// make counter for thirsty plant amount



    public int setThirstyPlant(){
        int thirstyPlants = 0;
        for (Plant p : plants) {
            if (p.needsH2o() == true) {
                thirstyPlants++;
            }
        }
        return thirstyPlants;
    }

    public void raining(int amountOfWater){
        System.out.println("Watering with " + amountOfWater);
        int thirstyPlants = setThirstyPlant();
        raining(amountOfWater, thirstyPlants);
        wateringStatus();
    }

    public void raining(int amountOfWater,int thirstyPlants){
        for (Plant p : plants) {
            if(p.needsH2o() == true) {
                p.addWater((amountOfWater / thirstyPlants));
            }
        }
    }



}
