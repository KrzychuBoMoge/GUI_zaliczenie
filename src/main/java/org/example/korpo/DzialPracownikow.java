package org.example.korpo;

import org.example.people.Pracownik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DzialPracownikow {
    private static ArrayList<String> dzialNameList = new ArrayList<>();
    private List<Pracownik> pracowniks = new ArrayList<>();
    private String name;
    private static int dzialID = 0;
    private int ID;



    private DzialPracownikow(String name) {
        this.name = name;
        ID = ++dzialID;
    }

    public static void createDzial(String name) throws NotUniqueNameException{
        if (!dzialNameList.contains(name.toLowerCase())) dzialNameList.add(name.toLowerCase());
        else throw new NotUniqueNameException("Nazwa: " + name + " nie jest unikalna.");
    }


}