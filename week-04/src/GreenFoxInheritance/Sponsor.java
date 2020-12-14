package GreenFoxInheritance;

public class Sponsor extends Person {

    protected String company;
    protected Integer hiredStudents;

    public Sponsor (String name, Integer age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce(){
        System.out.println(commonIntroduce() + " who represents " + company + " and hired " +  hiredStudents + " students so far.");
    }

    public Integer hire(){
        return hiredStudents++;
    }

    public void getGoal(){
        System.out.println(myGoal() + " Hire brilliant junior software developers.");
    }
}
