import java.util.Scanner;

// Write a program that reads a number from the standard input,
// then draws a pyramid like this:
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
public class drawPyramid {
    public static void main(String[] args) {
        //Bevesszük az input számot
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter number: ");
            int assHole = scanner.nextInt();

            //Végigmegyünk 0-tól az input számig (ezek lesznek a sorok)

            for (int i = 0; i < assHole; i++) {

            /*a piramis úgy épül fel, hogy ha az első sorban járunk:
            Akkor csak egy csillagot, minden más sorban pedig kettőt
            kell nyomtatni, a két szélén pedig 1-1 csilaggal több kell*/
                String toPrint = "";
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        toPrint = "*";
                    } else {
                        toPrint = toPrint + "**";
                    }

                }

                /* A csillagokon kívül az üres karaktereket is hasonlóan a
                 * sorszám függvénylben kell hozzáadni, hogy beljebb kezdődjenek
                 * Erre létrehozhatunk egy változót (numberOfSpaces):
                 * az assHole szám minusz a sorszám*/
                int numberOfSpaces = (assHole - i);
                String spaces = "";
                for (int k = 0; k < numberOfSpaces; k++) {
                    spaces = spaces + " ";
                }
                System.out.println(spaces + toPrint);

            }
        }


        }



