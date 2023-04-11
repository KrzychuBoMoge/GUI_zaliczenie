package org.example.korpo;

import org.example.people.Manager;
import org.example.people.Pracownik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Zespol {
    String nazwa;
    Manager manager;
    List<Pracownik> pracownicy;

    public Zespol(String nazwa, Manager manager, Pracownik[] pracownicy){
        this.nazwa = nazwa;
        this.manager = manager;
        this.pracownicy = Arrays.asList(pracownicy);
    }


}
