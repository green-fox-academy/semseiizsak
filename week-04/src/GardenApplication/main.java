package GardenApplication;

public class main {

    public static void main(String[] args) {
        Garden myGarden = new Garden();

        Flower rose = new Flower("red");
        Flower tulip = new Flower("yellow");
        Tree japaneseCherry = new Tree("pink");
        Tree oak = new Tree("green");

        myGarden.addPlant(rose);
        myGarden.addPlant(tulip);
        myGarden.addPlant(japaneseCherry);
        myGarden.addPlant(oak);

        myGarden.wateringStatus();
        System.out.println();
        myGarden.raining(40);
        System.out.println();
        myGarden.raining(70);
    }
}
