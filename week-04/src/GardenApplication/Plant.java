package GardenApplication;

public abstract class Plant{

    protected String color;
    protected double waterAmount;

    public Plant(String color){
        this.color = color;
        this.waterAmount = 0;
    }

// az egyenlő elosztás nélkül megnöveli a waterAmountot a waterlimithez képest

    public void addWater(int a) {
        this.waterAmount += waterPercent() * a;
    }

    public void wateringStatus(){
        if(needsH2o() == true) {
            System.out.println("The " + this.color +  " " + this.plantType() + " needs water.");
        } if(needsH2o() == false) {
            System.out.println("The " + this.color + " " + this.plantType() + " doesnt need water.");
        }
    }

// a flower and tree-hez
    public boolean needsH2o(){
        return waterAmount <= waterLimit();
    }

    public abstract String plantType();

    public abstract Double waterLimit();

    public abstract Double waterPercent();



}
