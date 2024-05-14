package de.hansemerkur.victor.inputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UbenInputLiebliengsZahlMitExcepcion {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int userLieblingszahl;
        try {
            System.out.println("Welche ist Ihre Lieblingszahl?\n");
            userLieblingszahl = scanner.nextInt();
            System.out.println("\nWaere die Zahl hier: " + (userLieblingszahl + 1) + " nicht eine groessere und passendere Lieblingszahl für Sie?\n");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("\nFalches Typ der Eingabe, wird ein Integer erwartet: " + e.getMessage());
        }
    }
}

