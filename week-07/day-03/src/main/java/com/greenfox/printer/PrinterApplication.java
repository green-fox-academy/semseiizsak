package com.greenfox.printer;

import com.greenfox.printer.service.MyColor;
import com.greenfox.printer.service.Printer;
import com.greenfox.printer.service.someColors.RedColor;
import com.greenfox.printer.service.someColors.YellowColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

    Printer printer;
    MyColor myColor;

    @Autowired
    PrinterApplication(Printer printer, @Qualifier("yellow") MyColor myColor){
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrinterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("!!SUCKYOURMOM!!");
        myColor.printColor();
    }
}
