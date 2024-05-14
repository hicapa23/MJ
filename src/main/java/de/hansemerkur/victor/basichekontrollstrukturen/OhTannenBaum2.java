package de.hansemerkur.victor.basichekontrollstrukturen;

import java.util.Scanner;


public class OhTannenBaum2 {

    protected int eingabeDesBenutzer;
    protected int langeDerBaumkrones;

    public OhTannenBaum2(int langeDesBaumes) {
        this.eingabeDesBenutzer = langeDesBaumes;
        this.langeDerBaumkrones = this.eingabeDesBenutzer;
    }

    public void erschaffenStrukturDesBaums() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= this.eingabeDesBenutzer; i++) {
            for (int j = 0; j < this.eingabeDesBenutzer - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
/*Ab hier wird die BaumKrone erstellt und beginnt die Logik, die den Baumstammt erzeugt*/

        var breiteDesBaumstamm = (this.eingabeDesBenutzer * 2 - 1) / 3;
        var hochDesBaumstam = this.eingabeDesBenutzer / 3;

        if (breiteDesBaumstamm % 2 == 0) {
            breiteDesBaumstamm += 1;
        }

        var abstand = (this.langeDerBaumkrones * 2 - 1 - breiteDesBaumstamm) / 2;

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
}
