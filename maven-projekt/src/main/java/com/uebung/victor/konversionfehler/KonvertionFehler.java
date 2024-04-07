package com.uebung.victor.konversionfehler;

public class KonvertionFehler {
    public static void main(String[] args) {

        /*
         * Fehler eingetreten, weil zwei keine Konvertierun stattgefunden hat und der
         * Computer erkennt nicht was zu tun ist
         * String mein_Geburtsmonat = "August" ;
         * int mein_Geburtstag = 3 ;
         * int error = Geburtsmonat + Geburtstag ;
         */

        String mein_Geburtsmonat = "August";
        int mein_Geburtstag = 3;
        String mein_GeburtstagZeichenkette = String.valueOf(mein_Geburtstag);
        String error = mein_GeburtstagZeichenkette + " " + mein_Geburtsmonat;

        System.out.println("Fehler der Konvertion??\n" + error);

    }

}
