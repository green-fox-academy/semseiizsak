package Zoo;

public class Animal {
    public int hunger;
    public int thirst;

    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public void eatSum(){
        this.hunger -= 1;
    }

    public void drinkSum(){
        this.thirst -= 1;
    }

    public void play(){
        this.hunger += 1;
        this.thirst += 1;
    }

    public static void main(String[] args) {
        Animal Elephant = new Animal();


        Elephant.eatSum();
        Elephant.drinkSum();

        System.out.println(" Current thirst level: " + Elephant.thirst + " Current hunger level: " + Elephant.hunger);


    }
}

