package com.greenfox.printer.service.someColors;

import com.greenfox.printer.service.MyColor;
import com.greenfox.printer.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("black")
public class BlackColor implements MyColor {
    Printer printer;

    @Autowired
    public BlackColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is black in color...");
    }

}
