package org.example.ludzie;

import org.example.architektura.DzialPracownikow;

import java.time.Duration;
import java.time.LocalDate;

public class Trener extends Pracownik {
    private String specjalizacja;
    private static long trenerID = 0;
    private long ID;

    public Trener(String imie, String nazwisko, LocalDate dataUrodzenia, DzialPracownikow dzial, String specjalizacja) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.specjalizacja = specjalizacja;
        ID=trenerID++;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + dataUrodzenia + " " + dzial + " " + specjalizacja + '\n';
    }

    @Override
    public boolean czyPodatekZerowy() {
        return Duration.between(dataUrodzenia.atStartOfDay(),LocalDate.now().atStartOfDay()).toDays()/365<26;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Dzień dobry, nazywam się " + imie + " " + nazwisko + ". Pracuje w dziale " + dzial);
    }

    @Override
    public long getId() {
        return trenerID;
    }
}
