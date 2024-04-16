package de.hansemerkur.victor.basichekontrollstrukturen;

import java.util.Scanner;

public class ZahlenUbersetzer2 {

    public int romicheZahlZuDezimal(String romichezahl) {
        int dezimal = 0; //
        int letzterWert = 0; //

        for (int i = romichezahl.length() - 1; i >= 0; i--) {

            char aktuellesChar = romichezahl.charAt(i);

            int numerischerWert = romicheZahlCharToDezimal(aktuellesChar);

            if (numerischerWert < letzterWert) {
                dezimal -= numerischerWert;
            } else {
                dezimal += numerischerWert;

                letzterWert = numerischerWert;
            }

        }
        return dezimal;
    }

    private int romicheZahlCharToDezimal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new RuntimeException("Ungültiges Zeichen: " + c);
        }
    }

    public static void main(String[] args) {
        ZahlenUbersetzer2 umwandler = new ZahlenUbersetzer2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine römische Zahl bitte ein: ");
        var romischeZiffer = scanner.nextLine();

        int dezimalZahl = umwandler.romicheZahlZuDezimal(romischeZiffer);

        System.out.println("Die roemische Zahl " + romischeZiffer + " ist in dezimal gleich: " + dezimalZahl);

        scanner.close();
    }
}
