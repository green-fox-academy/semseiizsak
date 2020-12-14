import java.util.ArrayList;
import java.util.Collection

public class ListIntroduction1 {
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2) + "\n");

        for (String allNames: names) {
            System.out.println(allNames+"\n");
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }
        names.remove(3);

        for (String reverse: names) {
            System.out.println();
        }

        Collections.reverse(names);
    }

}
