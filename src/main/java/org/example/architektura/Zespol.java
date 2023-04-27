package org.example.architektura;

import org.example.ludzie.Manager;
import org.example.ludzie.Pracownik;

import java.util.Arrays;
import java.util.List;

public class Zespol {
    private String nazwa;
    private Manager manager;
    private List<Pracownik> pracownicy;

    private static long zespolID = 0;
    private long ID;


    public Zespol(String nazwa, Manager manager){
        this.nazwa = nazwa;
        this.manager = manager;
        ID = zespolID++;
    }

    public void addEmployee(Pracownik pracownik) throws ManagerCannotBeWorker {
        if(pracownik instanceof Manager) throw new ManagerCannotBeWorker("Manager nie może być zwykłym pracownikiem!");
        else pracownicy.add(pracownik);
    }

    public void addEmployee(Pracownik[] pracownik) throws ManagerCannotBeWorker {
        for (Pracownik p :
                pracownik) {
            if(p instanceof Manager) throw new ManagerCannotBeWorker("Manager nie może być zwykłym pracownikiem!");
        }
        pracownicy.addAll(Arrays.asList(pracownik));
    }

}
