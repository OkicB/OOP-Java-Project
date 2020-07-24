package com.example.bekirapplication;

import java.util.Scanner;

public class App {
    public static String ime;
    public static String prezime;
    public static void main(String[] args) {
        login();
    }

    public static void prikazOsnovnihInformacija() {
        System.out.println("Izaberite opciju: " +
                "\n\t1. Login" +
                "\n\t2. Pitanja" +
                "\n\t3. Pregled" +
                "\n\t4. Izlaz");

        Scanner unos=new Scanner(System.in);
        int izbor= unos.nextInt();
        switch (izbor) {
            case 1:
                login();
                break;
            case 2:
                prikazPitanja();
                break;
            case 3:
                view();
                break;
            default:
                break;
        }
    }

    public static void login() {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        ime = unos.next();
        System.out.println("Unesite prezime: ");
        prezime = unos.next();
        prikazPitanja();
    }
    public static void prikazPitanja() {
        System.out.println("Izaberite pitanje od 1 do 5");
        Scanner scanner= new Scanner(System.in);
        int brojPitanja=scanner.nextInt();
        switch (brojPitanja) {
            case 1:
                Pitanja pitanja=new Pitanja();
                pitanja.postaviPitanje();
                break;
            case 2:
                Pitanja pitanja2=new Pitanja();
                pitanja2.postaviPitanje2();
                break;
            case 3:
                Pitanja pitanja3=new Pitanja();
                pitanja3.postaviPitanje3();
                break;
            case 4:
                Pitanja pitanja4=new Pitanja();
                pitanja4.postaviPitanje4();
                break;
            case 5:
                Pitanja pitanja5=new Pitanja();
                pitanja5.postaviPitanje5();
                break;
            default:
                break;
        }
        prikazOsnovnihInformacija();
    }
    public static void view() {
        Pregled view2=new Pregled();
        view2.pregled();
        prikazOsnovnihInformacija();
    }
}
