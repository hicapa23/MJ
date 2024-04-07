package com.uebung.victor.inputs;


import java.util.Scanner;

/*  Vollständige Namensansage. Schreiben Sie ein Programm, das nach dem Vornamen einer Person fragt, dann nach dem mittleren und dann nach dem Nachnamen. Schließlich soll es die Person mit ihrem vollen Namen begrüßen.*/

public class UbenInputNamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * auf diese Weise werde die Parameter zugeornet nach der eingetragene
         * Index-Position
         * String userVorname = args[0]; //scanner.nextLine();
         * 
         * System.out.println("Wie lautet Ihre Nachname?\n");
         * String userNachname = args[1]; //scanner.nextLine();
         */

        System.out.println("Wie heissen Sie?\n");
        var userVorname = scanner.nextLine();

        System.out.println("Wie lautet Ihre Nachname?\n");
        var userNachname = scanner.nextLine();

        System.out.println("Hallo" + " " + userVorname + " " + userNachname);

        scanner.close();

    }
}