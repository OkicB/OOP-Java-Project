package com.example.bekirapplication;

import static com.example.bekirapplication.App.ime;
import static com.example.bekirapplication.App.prezime;

public class Pregled {
    public void pregled() {
        Pitanja bodovi=new Pitanja();
        int bod=bodovi.points;
        System.out.println("Ime:" + ime + "\nPrezime: " + prezime + "\nBodovi: "+ bod);
    }
}
