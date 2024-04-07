package com.uebung.victor.inputs;


import java.util.Scanner;

/*
- Größere, bessere Lieblingszahl. Schreiben Sie ein Programm, das nach der Lieblingszahl einer Person fragt. Lassen Sie Ihr Programm 1 zu der Zahl addieren und schlagen Sie dann das Ergebnis als größere und bessere Lieblingszahl vor. (Seien Sie dabei aber taktvoll.)
*/

public class UbenInputLieblingsZahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welche ist Ihre Lieblingszahl?\n");
        int userLieblingszahl = scanner.nextInt();

        System.out.println("\nWaere die Zahl hier: " + (userLieblingszahl + 1)
                + " nicht eine groessere und passendere Lieblingszahl für Sie\n");

        scanner.close();

    }
}