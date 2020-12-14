package Task04;

public class Sharpie {
    public String color;
    public float width;
    public float inkAmount;

    public Sharpie (String color, float width){
        this.width += 50;
        this.inkAmount += 50;
    }

    public float use(float howManyTimes){
        this.inkAmount -= howManyTimes;
        return howManyTimes;
    }

    public static void main(String[] args) {
        Sharpie test = new Sharpie("",50);
        test.use(10);

        System.out.println(test.inkAmount);
    }
}

