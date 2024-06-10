package de.hansemerkur.victor.inputs;


import java.util.Scanner;


public class UbenInputNamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wie heissen Sie?\n");
        var userVorname = scanner.nextLine();

        System.out.println("\nWie lautet Ihre Nachname?\n");
        var userNachname = scanner.nextLine();

        System.out.println("\nHallo" + " " + userVorname + " " + userNachname);

        scanner.close();

    }
}