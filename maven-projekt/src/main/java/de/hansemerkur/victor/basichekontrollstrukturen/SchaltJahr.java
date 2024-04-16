package de.hansemerkur.victor.basichekontrollstrukturen;

/* Schaltjahre. Schreiben Sie ein Programm, das nach einem Start- und einem Endjahr fragt und dann alle Schaltjahre dazwischen setzt (einschließlich Thermik, wenn es sich 
ebenfalls um Schaltjahre handelt). Schaltjahre sind durch 4 teilbare Jahre 

(1ke 1984 50 - Kapitel 7. Flusskontrolle
und 2004). Durch 100 teilbare Jahre sind jedoch keine Schaltjahre (wie z. B. 1800 und 1900), es sei denn, sie sind auch durch 400 teilbar (wie z. B. 1600 und 2000, die in der Tat
Schaltjahre waren). Was für ein Durcheinander!
Wenn du damit fertig bist, mach eine Pause. Das war eine Menge Programmieren. Herzlichen Glückwunsch! Sie sind auf einem guten Weg. Entspannen Sie sich, trinken Sie ein schönes 
kaltes Bier (eventuell mit Wurzel) und machen Sie morgen weiter.*/

import java.util.Scanner;


public class SchaltJahr {
    public static void main (String[ ] args){ 
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("\nGeben Sie ein Startjahr");
        var startJahr = scanner.nextInt();

        System.out.println("\nGeben Sie ein Endjahr");
        var Endjahr = scanner.nextInt();
   
        while (startJahr <= Endjahr){

            if (startJahr % 4 == 0 && (startJahr % 100 != 0 || startJahr % 400 == 0 )){
                System.out.println("Das aktuelle Jahr ist ein Schaltjahr:" + startJahr);
            } 
            startJahr++;
           
        } 
    
    scanner.close();

    }
}
