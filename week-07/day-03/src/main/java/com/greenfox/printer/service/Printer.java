package com.greenfox.printer.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
public class Printer {

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

}
