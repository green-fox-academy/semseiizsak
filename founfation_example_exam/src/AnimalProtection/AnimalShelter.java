package AnimalProtection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter extends Animal{
    int budget;
    List<Animal> animals = new ArrayList<>();
    List<String> adopters = new ArrayList<>();

    public AnimalShelter(String name, String ownerName, Boolean isHealthy, int healCost, int budget, List<Animal> animals, List<String> adopters) {
        super(name, ownerName, isHealthy, healCost);
        this.budget = 50;
        this.animals = animals;
        this.adopters = adopters;
    }

    public int rescue(Animal animal) {
        animals.add(animal);
        return animals.size();
    }

    public int healed() {

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            if (!animal.getHealthy() || animal.getHealCost() < budget) {
                return  1;
            }
        }
        return 0;
    }

    public void addAdopter(String adopter) {
        adopters.add(adopter);
    }

    public void findNewOwner() {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = 0; j < adopters.size(); j++) {
                Animal animal = animals.get(i);
                if (animal.isAdoptable()) {
                    animals.remove(animal);
                }
                adopters.remove(i);
            }
        }
    }

    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    public String toString() {

        return "Budget: " + this.budget + " €,\n" +
                "There are " + this.animals.size() + " animal(s) and " + this.adopters.size() + " potential adopter(s)\n" +
                animals.toString();
    }

}
