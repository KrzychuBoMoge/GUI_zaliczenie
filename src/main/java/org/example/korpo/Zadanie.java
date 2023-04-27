package org.example.korpo;

import java.time.LocalDateTime;
import java.util.Random;

public class Zadanie extends Thread{
    private String nazwa;
    private String opis;
    private Stan stan = Stan.Utworzone;
    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataZakończenia;
    private int czasWykonania = new Random().nextInt(5)+3;

    public Zadanie(String nazwa){
        this.nazwa = nazwa;
    }

    public Zadanie(String nazwa, String opis, String zatwierdzenie){
        this.nazwa = nazwa;
        this.opis = opis;
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
}
