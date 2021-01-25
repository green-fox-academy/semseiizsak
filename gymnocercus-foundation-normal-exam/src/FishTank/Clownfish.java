package FishTank;

public class Clownfish extends Fish {

    private String stripeColor;

    public Clownfish(){
        super("Pizsi", 1, "orange");
        this.stripeColor = "black";
    }

    public Clownfish(String name, int weight, String color, String stripeColor) {
        super(name, weight, color);
    }

    @Override
    public String status() {
        return super.status() + "additional stripe color: " + this.stripeColor;
    }

    @Override
    public void feed() {
        super.feed();
    }
}
