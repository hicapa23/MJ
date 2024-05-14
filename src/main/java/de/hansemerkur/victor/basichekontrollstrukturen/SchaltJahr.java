package de.hansemerkur.victor.basichekontrollstrukturen;

import java.util.Scanner;


public class SchaltJahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var bedingung = true;

        while (bedingung) {

            var startJahr = 0;

            var endJahr = 0;

            System.out.println("\nGeben Sie ein Startjahr: ");

            if (scanner.hasNextInt()) {
                startJahr = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\nGeben Sie ein Endjahr: ");


                if (scanner.hasNextInt()) {
                    endJahr = scanner.nextInt();
                    scanner.nextLine();
                    bedingung = false;

                    while (startJahr <= endJahr) {

                        if (startJahr % 4 == 0 && (startJahr % 100 != 0 || startJahr % 400 == 0)) {
                            System.out.println("Das aktuelle Jahr ist ein Schaltjahr:" + startJahr);
                        }
                        startJahr++;

                    }
                } else {
                    System.out.println("Die Eingabe war keine Zahl ");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Die Eingabe war keine Zahl ");
                scanner.nextLine();
            }
        }
            scanner.close();
    }
}