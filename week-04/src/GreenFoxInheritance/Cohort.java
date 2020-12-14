package GreenFoxInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    protected String name;
    protected List <Student> students;
    protected List <Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student Student){
        students.add(Student);
    }

    public void addMentor(Mentor Mentor){
        mentors.add(Mentor);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }


}
