package org.example.ludzie;

import org.example.architektura.DzialPracownikow;
import org.example.architektura.Zespol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Recepcjonista{
    private List<Zespol> zespolList = new ArrayList<>();
    private List<String> zadania = new ArrayList<>();
    private static long managerID = 0;
    private long ID;

    public Manager(String imie, String nazwisko, LocalDate dataUrodzenia, DzialPracownikow dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial, login, haslo);
        ID = managerID++;
    }

    @Override
    public long getId() {
        return managerID;
    }
}
