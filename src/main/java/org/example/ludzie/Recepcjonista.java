package org.example.ludzie;

import org.example.architektura.DzialPracownikow;

import java.time.Duration;
import java.time.LocalDate;

public class Recepcjonista extends Pracownik{
    private String login,haslo;
    private String initial;
    private static long recepcjonistaID = 0;
    private long ID;



    public Recepcjonista(String imie, String nazwisko, LocalDate dataUrodzenia, DzialPracownikow dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.login = login;
        this.haslo = haslo;
        initial = String.valueOf(imie.toUpperCase().charAt(0)+nazwisko.toUpperCase().charAt(0));
        ID=recepcjonistaID++;
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
        return recepcjonistaID;
    }

    //overrige chaneinfo
}
