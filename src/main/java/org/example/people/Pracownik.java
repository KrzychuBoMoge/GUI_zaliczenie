package org.example.people;

import org.example.korpo.DzialPracownikow;

import java.util.ArrayList;
import java.util.List;

public abstract class Pracownik implements Comparable, IDobryPracownik {
    private static List<Pracownik> pracowniks = new ArrayList<>();
    protected String imie;
    protected String nazwisko;
    protected String dataUrodzenia;
    protected DzialPracownikow dzial;
    protected boolean czyZdrowy = true;
    public Pracownik(String imie, String nazwisko, String dataUrodzenia, DzialPracownikow dzial){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dzial = dzial;

        pracowniks.add(this);
    }

    @Override
    public int compareTo(Object o) {
        Pracownik p = (Pracownik) o;
        if ((this.imie + this.nazwisko).equals(p.imie + p.nazwisko)) return this.dataUrodzenia.equals(p.dataUrodzenia)?-1:1;
        else return (this.imie + this.nazwisko).equals(p.imie + p.nazwisko)?-1:1;
    }


    public boolean isCzyZdrowy() {
        return czyZdrowy;
    }

    public static List<Pracownik> getPracowniks() {
        return pracowniks;
    }

    //changeinfo
}
