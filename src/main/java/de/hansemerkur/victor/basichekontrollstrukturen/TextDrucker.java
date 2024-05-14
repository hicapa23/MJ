package de.hansemerkur.victor.basichekontrollstrukturen;

import java.util.Scanner;
import java.util.Random;

public class TextDrucker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        var minRamdon = 1930;
        var maxRamdon = 1950;

        var numRamdonGenerator = random.nextInt(maxRamdon - minRamdon + 1) + minRamdon;

        var  redeMitOma = "";

        var flascheMenge = 99;

        while (flascheMenge > 0) {

            System.out.println(flascheMenge + " bottles of beer on the wall, " + flascheMenge
                    + " bottles of beer.Take one down and pass it around, " + (flascheMenge - 1)
                    + " bottles of beer on the wall.\n");

            flascheMenge--;

        }

        System.out.println(
                "\no more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.\n");

        do {

            System.out.println("\nWollen Sie etwas zu Oma sagen ja oder nein?");
            var antwort = scanner.nextLine();

            if ("ja".equalsIgnoreCase(antwort)) {

                System.out.println("\nWas möchten Sie zu Oma sagen?");
                var mitteilungFuerOma = scanner.nextLine();

                System.out.println("\nMitteilung für Oma: " + mitteilungFuerOma + "\n");

                if (mitteilungFuerOma.equals(mitteilungFuerOma.toUpperCase())) {

                    System.out.println("\nNEIN, NICHT SEIT " + numRamdonGenerator + "\n");

                } else {
                    System.out.println("\nHUH?!  SPREICH, SONNY!\n");
                }

                for (int i = 0; i < 3; i++) {
                    System.out.println("\nMoechten Sie noch mit Oma weiter reden? Wenn nicht, schreiben Sie 'BYE' ");
                    redeMitOma = scanner.nextLine();

                    if (!"BYE".equals(redeMitOma)) {
                        break;
                    }
                }

            }

            else {
                break;
            }

        } while (!"BYE".equals(redeMitOma));
        scanner.close();
    }

}
