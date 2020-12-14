package GreenFoxInheritance;

public class Student extends Person{

    protected String previousOrganization;
    protected Integer skippedDays;

    public Student(String name, Integer age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println(commonIntroduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public Integer skipDays(Integer numberOfDays){
        this.skippedDays = this.skippedDays + numberOfDays;
        return skippedDays;
    }
}
