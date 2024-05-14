package de.hansemerkur.victor.basichekontrollstrukturen;

import java.util.Scanner;

public class ZahlenUbersetzer2 {

    public int romicheZahlZuDezimal(String romichezahl) {

        var dezimal = 0;
        var letzterWert = 0;

        for (int i = romichezahl.length() - 1; i >= 0; i--) {

            var aktuellesChar = romichezahl.charAt(i);

            var numerischerWert = romicheZahlCharToDezimal(aktuellesChar);

            if (numerischerWert < letzterWert) {
                dezimal -= numerischerWert;
            } else {
                dezimal += numerischerWert;

                letzterWert = numerischerWert;
            }

        }
        return dezimal;
    }

    private int romicheZahlCharToDezimal(char aktuellesChar) {
        return switch (aktuellesChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new RuntimeException("Ungültiges Zeichen: " + aktuellesChar);
        };
    }

    public static void main(String[] args) {

        var umwandler = new ZahlenUbersetzer2();
        var scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine römische Zahl bitte ein: ");
        var romischeZiffer = scanner.nextLine();

        var dezimalZahl = umwandler.romicheZahlZuDezimal(romischeZiffer);

        System.out.println("Die roemische Zahl " + romischeZiffer + " ist in dezimal gleich: " + dezimalZahl);

        scanner.close();

    }
}
