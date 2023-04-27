package org.example;

import java.time.Duration;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2002,6,21);
        System.out.println(Duration.between(localDate.atStartOfDay(),LocalDate.now().atStartOfDay()).toDays()/365);
    }
}