package org.example.architektura;

import java.util.HashMap;
import java.util.Map;

public class Praca implements Runnable {

    private Map<Integer, Zadanie> zadanieMap = new HashMap<>();
    private String opis;
    private Zespol zespol;
    private static long pracaID = 0;
    private long ID;

    public Praca(String opis, Zespol zespol) {
        this.opis = opis;
        this.zespol = zespol;
        ID = pracaID++;
    }

    public void dodajZadanie(int ID){
        zadanieMap.put(ID,Zadanie.getZadanie(ID));
    }
    @Override
    public void run() {
        for (Zadanie z :
                zadanieMap.values()) {
            if (z.czyZatwierdzone()) System.out.println(z);
            else System.out.println("Zadanie o id: " + z.getId() + " nie zostało zatwierdzone i nie może zostać wykonane.");
        }
    }
}
