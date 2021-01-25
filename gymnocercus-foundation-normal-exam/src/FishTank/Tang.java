package FishTank;

public class Tang extends Fish{

    private Boolean memoryLoss = true;

   public Tang(){
        super("Tang", 1, "blue");
        this.memoryLoss = memoryLoss;
    }

    public Tang(String name, int weight, String color, Boolean memoryLoss) {
        super(name, weight, color);
        this.memoryLoss = memoryLoss;
    }

    @Override
    public String status() {
        return super.status() + "short-term memory loss: " + this.memoryLoss;
    }

    @Override
    public void feed() {
        super.feed();
    }
}
