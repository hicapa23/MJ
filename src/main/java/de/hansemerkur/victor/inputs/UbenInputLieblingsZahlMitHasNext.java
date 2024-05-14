package de.hansemerkur.victor.inputs;


import java.util.Scanner;




public class UbenInputLieblingsZahlMitHasNext {
    public static void main(String[] args) {
        boolean bedigung = true;

        do {
            var scanner = new Scanner(System.in);
            System.out.println("\nWelche ist Ihre Lieblingszahl?");

            int userLieblingszahl = 0;


            if (scanner.hasNextInt()) {

                userLieblingszahl = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\nSo wird kontrolliert das die Eingabe von Format/Typ richtig ist, Eingabe: " + userLieblingszahl);
                System.out.println("\nWaere die Zahl hier: " + (userLieblingszahl + 1) + " nicht eine groessere und passendere Lieblingszahl für Sie?\n");
                bedigung = false;

            } else {
                System.out.println("\nIhre Eingabe ist kein Integer, versuchen Sie es  bitte nochmals");

            }

        } while (bedigung);


    }
}


