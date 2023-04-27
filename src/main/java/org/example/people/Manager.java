package org.example.people;

import org.example.korpo.DzialPracownikow;
import org.example.korpo.Zespol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Recepcjonista{
    private List<Zespol> zespolList = new ArrayList<>();
    private List<String> zadania = new ArrayList<>();


    public Manager(String imie, String nazwisko, String dataUrodzenia, DzialPracownikow dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial, login, haslo);
    }
}
