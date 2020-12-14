package Task05;

public class Counter{
    int fieldValue = 0;
    int fieldReset = fieldValue;

    public Counter(){}

    public Counter (int fieldValue){
        this.fieldValue = fieldValue;
        this.fieldReset = fieldValue;
    }


    public void add(){
        this.fieldValue++;
    }

    public int get(){
        return this.fieldValue;
    }

    public void reset(){
        fieldValue = fieldReset;
    }

    public void add(int more){
        this.fieldValue = more + 1;
    }

    public static void main(String[] args) {
        Counter test = new Counter(50);

        test.get();
        System.out.println(test.fieldValue);

        test.add();
        System.out.println(test.fieldValue);

        test.get();
        System.out.println(test.fieldValue);

        test.reset();
        System.out.println(test.fieldValue);

        test.add(5);
        System.out.println(test.fieldValue);
    }
}
