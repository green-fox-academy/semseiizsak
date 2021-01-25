package FishTank;

public class Fish {
    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String status(){
        return this.name + ", weight:" + this.weight + ", color:" + this.color + " and "; //finish this
    }

    public void feed(){
        this.weight += 1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
