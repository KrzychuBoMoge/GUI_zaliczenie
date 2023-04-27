package org.example.people;

import org.example.korpo.DzialPracownikow;

public class Recepcjonista extends Pracownik{
    private String login,haslo;
    private String initial;

    public Recepcjonista(String imie, String nazwisko, String dataUrodzenia, DzialPracownikow dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.login = login;
        this.haslo = haslo;
        initial = String.valueOf(imie.toUpperCase().charAt(0)+nazwisko.toUpperCase().charAt(0));
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

    //overrige chaneinfo
}
