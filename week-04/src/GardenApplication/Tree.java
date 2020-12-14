package GardenApplication;

public class Tree extends Plant{

    protected double waterAmount;


    public Tree(String color) {
        super(color);
    }

    @Override
    public void wateringStatus() {
        super.wateringStatus();
    }

    @Override
    public String plantType() {
        return "Tree";
    }

    @Override
    public Double waterPercent() {
        return 0.4;
    }

    @Override
    public Double waterLimit() {
        return Double.valueOf(10);
    }


}
