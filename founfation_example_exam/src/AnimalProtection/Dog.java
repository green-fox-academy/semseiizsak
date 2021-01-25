package AnimalProtection;

import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animal {
    public Dog(String ownerName, Boolean isHealthy, int healCost) {
        super(ownerName, isHealthy, healCost);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        this.healCost = randomNum;
    }

    public Dog(String name, String ownerName, Boolean isHealthy, int healCost) {
        super(name, ownerName, isHealthy, healCost);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

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
