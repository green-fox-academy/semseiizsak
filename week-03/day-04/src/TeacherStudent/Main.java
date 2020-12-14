package TeacherStudent;

public class Main {
    public static void main(String[] args) {
        Student Nebuló = new Student();
        Teacher Satan = new Teacher();

        Nebuló.question(Satan);
        Satan.teach(Nebuló);
    }
}
