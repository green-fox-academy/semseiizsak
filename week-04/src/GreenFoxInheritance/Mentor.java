package GreenFoxInheritance;

public class Mentor extends Person {

    protected String level;

    public void getGoal(){
        System.out.println(myGoal() + " Educate brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println(commonIntroduce() + " " + level + " mentor.");
    }

    public Mentor(String name, Integer age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }
}
