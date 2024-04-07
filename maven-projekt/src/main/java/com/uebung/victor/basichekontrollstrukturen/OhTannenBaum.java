package com.uebung.victor.basichekontrollstrukturen;

import java.util.Scanner;

public class OhTannenBaum {

    public static int eingabeDesBenutzer;
    public static int langeDerBaumkrones;

    public static void baumkrone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie bitte die Laenge der Baumkrone: ");
        eingabeDesBenutzer = scanner.nextInt();
        langeDerBaumkrones = eingabeDesBenutzer;

        for (int i = 1; i <= eingabeDesBenutzer; i++) {
            for (int j = 0; j < eingabeDesBenutzer - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void stammDesBaums() {

        var breiteDesBaumstamm = (eingabeDesBenutzer * 2 - 1) / 3;
        var hochDesBaumstam = eingabeDesBenutzer / 3;

        if (breiteDesBaumstamm % 2 == 0) {
            breiteDesBaumstamm += 1;
        }

        var abstand = (langeDerBaumkrones * 2 - 1 - breiteDesBaumstamm) / 2;

        for (int l = 0; l < hochDesBaumstam; l++) {
            for (int m = 0; m < abstand; m++) {
                System.out.print(" ");

            }

            for (int n = 0; n < breiteDesBaumstamm; n++) {
                System.out.print("#");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        baumkrone();
        stammDesBaums();
    }

}
