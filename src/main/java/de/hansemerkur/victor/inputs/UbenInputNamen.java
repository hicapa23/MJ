package de.hansemerkur.victor.inputs;


import java.util.Scanner;

/*  Vollständige Namensansage. Schreiben Sie ein Programm, das nach dem Vornamen einer Person fragt, dann nach dem mittleren und dann nach dem Nachnamen. Schließlich soll es die Person mit ihrem vollen Namen begrüßen.*/

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