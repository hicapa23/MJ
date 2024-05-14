package de.hansemerkur.victor.zahlenubersetzer;

import java.util.Scanner;

public class ZahlenUbersetzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romicheZahl;
        int zahl;

        System.out.println("Geben Sie eine ganze Zahl zwischen 1 und 3999:");
        zahl = scanner.nextInt();

        if (zahl > 1 && zahl < 3999) {
            romicheZahl = konvertionZuRomischenZahlen(zahl);
            System.out.println(zahl + " In romischen Zahlen ist: " + romicheZahl);
        }

        else {

            System.out.println("Die nummer soll im Rang sein");
        }
        scanner.close();
    }

    public static String konvertionZuRomischenZahlen(int zahl) {

        String[] einheiten = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] zehner = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] hunderter = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tausende = { "", "M", "MM", "MMM" };

        int indexEinheiten, indexZehner, indexHunderter, indexTausende;

        indexTausende = zahl / 1000;   
        zahl = zahl % 1000;
        indexHunderter = zahl / 100;
        zahl = zahl % 100;
        indexZehner = zahl / 10;
        zahl = zahl % 10;
        indexEinheiten = zahl;

        return tausende[indexTausende] + hunderter[indexHunderter] + zehner[indexZehner] + einheiten[indexEinheiten];

    }
}
