package GardenApplication;

public class Flower extends Plant {

    protected double waterAmount;

    public Flower(String color) {
        super(color);
    }

    @Override
    public void wateringStatus() {
        super.wateringStatus();
    }

    @Override
    public String plantType() {
        return "Flower";
    }

    @Override
    public Double waterPercent() {
        return 0.75;
    }

    @Override
    public Double waterLimit() {
        return Double.valueOf(5);
    }


}
