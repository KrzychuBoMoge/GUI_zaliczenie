package org.example.people;

import org.example.korpo.DzialPracownikow;

import java.util.Date;
import java.util.List;

public abstract class Pracownik implements Comparable {
    public static List<String> pracownicy;
    private boolean czyZdrowy = true;
    public static void Pracownik(String imie, String Nazwisko, Date dataUrodzenia, DzialPracownikow dzial){}


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public boolean isCzyZdrowy() {
        return czyZdrowy;
    }

    //changeinfo
}
