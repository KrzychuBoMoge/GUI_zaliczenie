package org.example;

import org.example.korpo.DzialPracownikow;
import org.example.korpo.NotUniqueNameException;
import org.example.people.Pracownik;
import org.example.people.Trener;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        try {
            Trener t1 = new Trener("Tomasz","Andrzej","10-10-2002",DzialPracownikow.createDzial("IT"),"Serwisant");
            Trener t2 = new Trener("Tomasz","Andrzej","13-10-2002",DzialPracownikow.createDzial("Księgowość"),"Młodszy księgowy");
            Trener t3 = new Trener("Adam","Andrzej","13-10-2002",DzialPracownikow.createDzial("Ks"),"Młodszy księgowy");
            System.out.println(Pracownik.getPracowniks());
            System.out.println(t1.compareTo(t2));
            System.out.println(t1.compareTo(t3));
        } catch (NotUniqueNameException e) {
            throw new RuntimeException(e);
        }

    }
}