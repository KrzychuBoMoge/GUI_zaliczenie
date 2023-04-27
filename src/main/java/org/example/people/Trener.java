package org.example.people;

import org.example.korpo.DzialPracownikow;

import java.util.Date;

public class Trener extends Pracownik {
    private String specjalizacja;

    public Trener(String imie, String nazwisko, String dataUrodzenia, DzialPracownikow dzial, String specjalizacja) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + dataUrodzenia + " " + dzial + " " + specjalizacja + '\n';
    }

    @Override
    public boolean czyPodatekZerowy() {
        return false;
    }

    @Override
    public void przedstawSie() {

    }

    @Override
    public long getId() {
        return 0;
    }
}
