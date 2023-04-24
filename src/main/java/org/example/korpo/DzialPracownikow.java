package org.example.korpo;

import org.example.people.Pracownik;

import java.util.ArrayList;

import java.util.List;

public class DzialPracownikow {
    private static ArrayList<String> dzialNameList = new ArrayList<>();
    private List<Pracownik> pracowniks = new ArrayList<>();
    private String name;
    private static int dzialID = 0;
    private int ID;


    
    private DzialPracownikow(String name) {
        this.name = name;
        ID = dzialID++;
        dzialNameList.add(name.toUpperCase());
    }

    public static DzialPracownikow createDzial(String name) throws NotUniqueNameException{
        if (dzialNameList.contains(name.toUpperCase())) throw new NotUniqueNameException("Nazwa: " + name + " nie jest unikalna.");
        return new DzialPracownikow(name);
    }

    public String getPeacowniks() {
        return "Dział: " + this.name + '\n' +
                "Pracownicy: " + pracowniks.toString();

    }

}