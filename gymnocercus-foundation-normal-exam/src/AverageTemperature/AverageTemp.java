package AverageTemperature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class AverageTemp {

    public static void main(String[] args) {
        averageTemp("src/AverageTemperature/results.txt");
    }


    public static void averageTemp(String filePath) {

        String[] headerArray = {};
        List<String> yearDatas = new ArrayList<>();

        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            String headers = myReader.nextLine();
            headerArray = headers.split(" ");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                yearDatas.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no file here..");
        }

        for (int i = 0; i < headerArray.length - 1; i++) {
            String country = headerArray[i];
            int maxTemp = -30;
            int minTemp = 30;
            String maxTempYear = "";
            String minTempYear = "";

            //go trough current country data

            for (int j = 0; j < yearDatas.size(); j++) {
                String[] data = yearDatas.get(j).split(" ");

                //get max temp year
                if (parseInt(data[i]) > maxTemp) {
                    maxTemp = parseInt(data[i]);
                    maxTempYear = data[data.length - 1];
                }

                //get min temp year
                if (parseInt(data[i]) < minTemp) {
                    minTemp = parseInt(data[i]);
                    minTempYear = data[data.length - 1];
                }
            }

            //lefut minden countrynal miután megkapja

            System.out.println(country + " => " + minTempYear + ", " + maxTempYear);
        }

    }
}
