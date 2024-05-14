package de.hansemerkur.victor.konversionfehler;

public class KonvertionFehler {
    public static void main(String[] args) {

        /*
         * Fehler eingetreten, weil zwei keine Konvertierun stattgefunden hat und der
         * Computer erkennt nicht was zu tun ist
         * String mein_Geburtsmonat = "August" ;
         * int mein_Geburtstag = 3 ;
         * int error = Geburtsmonat + Geburtstag ;
         */

        var mein_Geburtsmonat = "August";
        var mein_Geburtstag = 3;
        var mein_GeburtstagZeichenkette = String.valueOf(mein_Geburtstag);
        var error = mein_GeburtstagZeichenkette + " " + mein_Geburtsmonat;

        System.out.println("\n\nFehler der Konvertion??\n\n" + error + "\n");

    }

}
