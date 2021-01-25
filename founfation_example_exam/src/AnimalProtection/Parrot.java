package AnimalProtection;

import java.util.concurrent.ThreadLocalRandom;

public class Parrot extends Animal {

    public Parrot(String ownerName, Boolean isHealthy, int healCost) {
        super(ownerName, isHealthy, healCost);

        int randomNum = ThreadLocalRandom.current().nextInt(4, 10 + 1);

        this.healCost = randomNum;

    }

    public Parrot(String name, String ownerName, Boolean isHealthy, int healCost) {
        super(name, ownerName, isHealthy, healCost);

        int randomNum = ThreadLocalRandom.current().nextInt(4, 10 + 1);

        this.healCost = randomNum;
    }



    @Override
    public boolean isAdoptable() {
        return super.isAdoptable();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
