package AnimalProtection;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {
    public Cat(String ownerName, Boolean isHealthy, int healCost) {
        super(ownerName, isHealthy, healCost);
        int randomNum = ThreadLocalRandom.current().nextInt(0, 6 + 1);

        this.healCost = randomNum;
    }

    public Cat(String name, String ownerName, Boolean isHealthy, int healCost) {
        super(name, ownerName, isHealthy, healCost);

        int randomNum = ThreadLocalRandom.current().nextInt(0, 6 + 1);

        this.healCost = randomNum;
    }



    @Override
    public boolean isAdoptable() {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
