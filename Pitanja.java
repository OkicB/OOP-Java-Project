package com.example.bekirapplication;

import java.util.Scanner;

public class Pitanja {
    public int points = 0;
    Scanner scanner=new Scanner(System.in);

    public void postaviPitanje() {
        //pitanje 1
        System.out.println("1. Podatak je elementarni opis:");
        System.out.println("\t 1. informacija");
        System.out.println("\t 2. transakcija");
        System.out.println("\t 3. događaja");
        System.out.println("\t 4. elemenata");
        System.out.println("\t 5. aktivnosti");

        System.out.println("Izaberite tacne odgovore pomoću broja: ");
        int odabir = scanner.nextInt();
        int odabirDva = scanner.nextInt();
        int odabirTri = scanner.nextInt();

        if (odabir == 2 && odabirDva == 3 && odabirTri == 5) {
            System.out.println("Tačan odgovor");
            points++;
        } else {
            System.out.println("Netačan odgovor");
        }
    }
        //pitanje 2
        public void postaviPitanje2() {

            System.out.println("2. Od čega se štite podaci:");
            System.out.println("\t 1. zlonamjernog softvera");
            System.out.println("\t 2. neovlaštenog pristupa");
            System.out.println("\t 3. bespotrebnih informacija");
            System.out.println("\t 4. oštećenja");
            System.out.println("\t 5. nijedno");

            System.out.println("Izaberite tacne odgovore pomoću broja: ");

            int odabir2 = scanner.nextInt();
            int odabirDrugi = scanner.nextInt();

            if (odabir2 == 2 && odabirDrugi == 4) {
                System.out.println("Tačan odgovor");
                points++;
            } else {
                System.out.println("Netačan odgovor");
            }
        }

        //pitanje 3
        public void postaviPitanje3() {

            System.out.println("3. Na šta primjena IT-a utiče negativno:");
            System.out.println("\t 1. privatnost");
            System.out.println("\t 2. učenje");
            System.out.println("\t 3. lična etika");
            System.out.println("\t 4. softver");
            System.out.println("\t 5. nijedno");

            System.out.println("Izaberite tacne odgovore pomoću broja: ");
            int odabir3 = scanner.nextInt();

            if (odabir3 == 1) {
                System.out.println("Tačan odgovor");
                points++;
            } else {
                System.out.println("Netačan odgovor");
            }
        }

        //pitanje 4
        public void postaviPitanje4() {

            System.out.println("4. Sabirnica koja se koristi za grafički sistem:");
            System.out.println("\t 1. ATA");
            System.out.println("\t 2. PCI Express");
            System.out.println("\t 3. TCP/IP");
            System.out.println("\t 4. SATA");
            System.out.println("\t 5. nijedno");

            System.out.println("Izaberite tacne odgovore pomoću broja: ");

            int odabir4 = scanner.nextInt();

            if (odabir4 == 2) {
                System.out.println("Tačan odgovor");
                points++;
            } else {
                System.out.println("Netačan odgovor");
            }
        }

        //pitanje 5
        public void postaviPitanje5() {
        System.out.println("5. Brzina prenosa IDE diskova:");
        System.out.println("\t 1. 100 MB/s");
        System.out.println("\t 2. 1 GB/s");
        System.out.println("\t 3. 10 GB/s");
        System.out.println("\t 4. 1 TB/s");
        System.out.println("\t 5. 50 MB/s");

        System.out.println("Izaberite tacne odgovore pomoću broja: ");

        int odabir5= scanner.nextInt();

        if (odabir5==1) {
            System.out.println("Tačan odgovor");
            points++;
        } else {
            System.out.println("Netačan odgovor");
        }

    }
}
