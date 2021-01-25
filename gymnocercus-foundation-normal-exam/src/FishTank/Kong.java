package FishTank;

public class Kong extends Fish{

    public Kong(){
        super("Tang", 1, "blue");
    }

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        super.feed();
        setWeight(+1);
    }

    @Override
    public String status() {
        return super.status() + "gets fat faster...";
    }
}
