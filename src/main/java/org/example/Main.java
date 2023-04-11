package org.example;

import org.example.korpo.DzialPracownikow;
import org.example.korpo.NotUniqueNameException;

public class Main {
    public static void main(String[] args) {
        DzialPracownikow.createDzial("IT");
        DzialPracownikow.createDzial("IT");
    }
}