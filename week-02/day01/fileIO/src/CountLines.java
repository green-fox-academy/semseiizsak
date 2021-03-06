import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(lineCounter("my-text.txt"));
    }
     public static int lineCounter(String fileName){
         try {
             Path filePath = Paths.get(fileName);
             List<String> lines = Files.readAllLines(filePath);
             return lines.size();
         } catch (Exception e) {
             return 0;
         }
    }
}
