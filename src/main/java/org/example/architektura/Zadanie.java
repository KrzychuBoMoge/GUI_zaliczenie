package org.example.architektura;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Zadanie extends Thread{

    private static ArrayList<Zadanie> zadanieList = new ArrayList<>();
    private String nazwa;
    private String opis;
    private Stan stan = Stan.Utworzone;
    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataZakończenia;
    private int czasWykonania = new Random().nextInt(5)+3;
    Zatwierdzenie zatwierdzenie = Zatwierdzenie.NIEZATWIERDZONE;
    private static long ID = 0;
    private long zadanieId;

    public Zadanie(String nazwa){
        this.nazwa = nazwa;
        zadanieId = ID++;
        zadanieList.add(this);
    }

    public Zadanie(String nazwa, String opis, Zatwierdzenie zatwierdzenie){
        this.nazwa = nazwa;
        this.opis = opis;
        this.zatwierdzenie = zatwierdzenie;
        zadanieId = ID++;
        zadanieList.add(this);
    }

    @Override
    public void run() {
        System.out.println(dataUtworzenia = LocalDateTime.now());
        stan = Stan.Rozpoczete;
        for (int i = 0; i < czasWykonania; i++) {
            try {
                System.out.println("Time: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(dataZakończenia = LocalDateTime.now());
        stan = Stan.Zakonczone;
    }

    public Stan getStan() {
        return stan;
    }

    public void setZatwierdzenie(Zatwierdzenie zatwierdzenie) {
        this.zatwierdzenie = zatwierdzenie;
    }

    public boolean czyZatwierdzone() {
        return zatwierdzenie.equals(Zatwierdzenie.ZATWIERDZONE);
    }

    public static Zadanie getZadanie(int zadanieId){
        return zadanieList.get(zadanieId);
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", stan=" + stan +
                ", dataUtworzenia=" + dataUtworzenia +
                ", dataZakończenia=" + dataZakończenia +
                ", zatwierdzenie=" + zatwierdzenie +
                '}';
    }
}
