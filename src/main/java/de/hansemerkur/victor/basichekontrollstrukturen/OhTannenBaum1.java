package de.hansemerkur.victor.basichekontrollstrukturen;


import java.util.Scanner;


/* Version von OhTannenBaum2 MIT STATISCHEN METHODEN, dieses Beispiel ist nutzlich, um den Unterschied zwischen die Modifier und auch die Statiche und
 * nicht Statiche statement zu verstehen*/


public class OhTannenBaum1 {

    private static int eingabeDesBenutzer;
    private static int langeDerBaumkrones;

    private static void printKrone() {
        var scanner = new Scanner(System.in);

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

    private static void printStamm() {

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
        printKrone();
        printStamm();
    }

}
