package AnimalProtection;

public class Animal {

//properties
    String ownerName;
    Boolean isHealthy;
    int healCost;
    String name;


    public Animal(String ownerName, Boolean isHealthy, int healCost) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
        name = "Animal";
    }

    public Animal(String name, String ownerName, Boolean isHealthy, int healCost) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
        this.name = name;
    }

    //constructors
    public boolean heal(){
        this.isHealthy = true;
        return isHealthy;
    }

    public boolean isAdoptable(){
        boolean adoptable;
        if(this.isHealthy == true){
            adoptable = true;
        } else {
            adoptable = false;
        }
        return adoptable;
    }

    public Boolean getHealthy() {
        return isHealthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (this.isHealthy) {
            return this.name + " is not healthy " + "(" + this.healCost + "€ heal cost), " + "and not adoptable";

        }
        return this.name + " is healthy " + "and adoptable";
    }
}
