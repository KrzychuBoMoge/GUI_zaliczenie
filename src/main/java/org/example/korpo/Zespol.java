package org.example.korpo;

import org.example.people.Manager;
import org.example.people.Pracownik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Zespol {
    private String nazwa;
    private Manager manager;
    private List<Pracownik> pracownicy;

    public Zespol(String nazwa, Manager manager){
        this.nazwa = nazwa;
        this.manager = manager;
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
