package GreenFoxInheritance;

public class Person {

    protected String name;
    protected Integer age;
    protected String gender;

    public Person(String name, Integer age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    protected String commonIntroduce(){
        return "Hi, I am " + name + ", a " + age +  " year old " + gender;
    }

    public void introduce(){
        System.out.println(commonIntroduce() + ".");
    }

    public void getGoal(){
        System.out.println(myGoal() + " Live for the moment!");
    }

    public String myGoal(){
        return "My goal is:";
    }

}
