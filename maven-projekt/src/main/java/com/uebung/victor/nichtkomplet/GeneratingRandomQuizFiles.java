package com.uebung.victor.nichtkomplet;



// import java.util.Set;
// import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/* import java.util.Random;
import java.io.File; //Esta bibioteca permite usar el metodo  File datei = new File ("xxxx.txt");para crear archivos de textp. */

public class GeneratingRandomQuizFiles {

    String fragen;
    List<String> moeglichenAnworten;
    String richtigeAntwort;

    public GeneratingRandomQuizFiles(String fragen, List<String> moeglichenAnworten, String richtigeAntwort) {

        this.fragen = fragen;
        this.moeglichenAnworten = moeglichenAnworten;
        this.richtigeAntwort = richtigeAntwort;

    }

    public boolean ueberpruefungAntwort(String gegebeneAntwort) {

        return gegebeneAntwort.equalsIgnoreCase(richtigeAntwort);

    }

    @Override
    public String toString() {
        return "GeneratingRandomQuizFiles [fragen=" + fragen + ", moeglichenAnworten=" + moeglichenAnworten
                + ", richtigeAntwort=" + richtigeAntwort + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GeneratingRandomQuizFiles> fragenoption = new ArrayList<>();

        List<String> moeglicheAntworten1 = new ArrayList<>();

        moeglicheAntworten1.add("Kairo");
        moeglicheAntworten1.add("Algier");
        moeglicheAntworten1.add("Luanda");
        moeglicheAntworten1.add("Malabo");
        moeglicheAntworten1.add("Addis Abeda");
        moeglicheAntworten1.add("Porto Novo");
        moeglicheAntworten1.add("Gaborone");
        moeglicheAntworten1.add("Ouagadougou");
        moeglicheAntworten1.add("Bujumbura");
        moeglicheAntworten1.add("Dschibuti");
        moeglicheAntworten1.add("Yamoussoukro");
        moeglicheAntworten1.add("Asmara");
        moeglicheAntworten1.add("Mbabane");
        moeglicheAntworten1.add("Libreville");
        moeglicheAntworten1.add("Banjul");
        moeglicheAntworten1.add("Accra");
        moeglicheAntworten1.add("Conakry");
        moeglicheAntworten1.add("Bissau");
        moeglicheAntworten1.add("Yaounde");
        moeglicheAntworten1.add("Praia");
        moeglicheAntworten1.add("Nairobi");
        moeglicheAntworten1.add("Moroni");
        moeglicheAntworten1.add("Kinshada");
        moeglicheAntworten1.add("Brazzaville");
        moeglicheAntworten1.add("Maseru");
        moeglicheAntworten1.add("Monrovia");
        moeglicheAntworten1.add("Tripolis");
        moeglicheAntworten1.add("Antananarivo");
        moeglicheAntworten1.add("Lilongwe");
        moeglicheAntworten1.add("Bamako");
        moeglicheAntworten1.add("Rabat");
        moeglicheAntworten1.add("Nouakchott");
        moeglicheAntworten1.add("Port Louis");
        moeglicheAntworten1.add("Maputo");
        moeglicheAntworten1.add("Windhoek");
        moeglicheAntworten1.add("Niamey");
        moeglicheAntworten1.add("Abuja");
        moeglicheAntworten1.add("Kigali");
        moeglicheAntworten1.add("Lusaka");
        moeglicheAntworten1.add("San Tome");
        moeglicheAntworten1.add("Dakar");
        moeglicheAntworten1.add("Victoria");
        moeglicheAntworten1.add("Freetown");
        moeglicheAntworten1.add("Harare");
        moeglicheAntworten1.add("Mogadischu");
        moeglicheAntworten1.add("Pretoria");
        moeglicheAntworten1.add("Khartum");
        moeglicheAntworten1.add("Juba");
        moeglicheAntworten1.add("Dodoma");
        moeglicheAntworten1.add("Lome");

        GeneratingRandomQuizFiles frage1 = new GeneratingRandomQuizFiles(
                "Was ist die Hauptstadt von Aequatorialguinea? ",
                moeglicheAntworten1, "Malabo");

        GeneratingRandomQuizFiles frage2 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Aethiopien? ",
                moeglicheAntworten1, "Addis Abeda");

        GeneratingRandomQuizFiles frage3 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Benin? ",
                moeglicheAntworten1, "Porto Novo");

        GeneratingRandomQuizFiles frage4 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Porto-Novo? ",
                moeglicheAntworten1, "Gaborone");

        GeneratingRandomQuizFiles frage5 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von  Burkina Faso? ",
                moeglicheAntworten1, "Ouagadougou");

        GeneratingRandomQuizFiles frage6 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Burundi? ",
                moeglicheAntworten1, "Bujumbura");

        GeneratingRandomQuizFiles frage7 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Dschibuti? ",
                moeglicheAntworten1, "Dschibuti");

        GeneratingRandomQuizFiles frage8 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Elfenbeinküste? ",
                moeglicheAntworten1, "Yamoussoukro");

        GeneratingRandomQuizFiles frage9 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Eritrea? ",
                moeglicheAntworten1, "Asmara");

        GeneratingRandomQuizFiles frage10 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Eswatini? ",
                moeglicheAntworten1, "Mbabane");

        GeneratingRandomQuizFiles frage11 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Gabun? ",
                moeglicheAntworten1, "Libreville");

        GeneratingRandomQuizFiles frage12 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Gambia? ",
                moeglicheAntworten1, "Banjul");

        GeneratingRandomQuizFiles frage13 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Ghana? ",
                moeglicheAntworten1, "Accra");
        GeneratingRandomQuizFiles frage14 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Guinea? ",
                moeglicheAntworten1, "Conakry");

        GeneratingRandomQuizFiles frage15 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Guinea-Bissau? ",
                moeglicheAntworten1, "Bissau");

        GeneratingRandomQuizFiles frage16 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Kamerun? ",
                moeglicheAntworten1, "Yaounde");

        GeneratingRandomQuizFiles frage17 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Kap Verde? ",
                moeglicheAntworten1, "Praia");

        GeneratingRandomQuizFiles frage18 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Kenia? ",
                moeglicheAntworten1, "Nairobi");

        GeneratingRandomQuizFiles frage19 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Komoren? ",
                moeglicheAntworten1, "Moroni");

        GeneratingRandomQuizFiles frage20 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Kongo? ",
                moeglicheAntworten1, "Kinshasa");

        GeneratingRandomQuizFiles frage21 = new GeneratingRandomQuizFiles(
                "Was ist die Hauptstadt von Kongo (Republik)? ",
                moeglicheAntworten1, "Brazzaville");

        GeneratingRandomQuizFiles frage22 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Lesotho? ",
                moeglicheAntworten1, "Maseru");

        GeneratingRandomQuizFiles frage23 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Liberia? ",
                moeglicheAntworten1, "Monrovia");

        GeneratingRandomQuizFiles frage24 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Libyen? ",
                moeglicheAntworten1, "Tripolis");

        GeneratingRandomQuizFiles frage25 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Madagaskar? ",
                moeglicheAntworten1, "Antananarivo");

        GeneratingRandomQuizFiles frage26 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Malawi?",
                moeglicheAntworten1, "Lilongwe");

        GeneratingRandomQuizFiles frage27 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Mali? ",
                moeglicheAntworten1, "Bamako");

        GeneratingRandomQuizFiles frage28 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Marokko? ",
                moeglicheAntworten1, "Rabat");

        GeneratingRandomQuizFiles frage29 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Mauretanien? ",
                moeglicheAntworten1, "Nouakchott");

        GeneratingRandomQuizFiles frage30 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Mauritius? ",
                moeglicheAntworten1, "Port Louis");

        GeneratingRandomQuizFiles frage31 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von  Mosambik? ",
                moeglicheAntworten1, "Maputo");

        GeneratingRandomQuizFiles frage32 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Namibia? ",
                moeglicheAntworten1, "Windhoek");

        GeneratingRandomQuizFiles frage33 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Niger? ",
                moeglicheAntworten1, "Niamey");

        GeneratingRandomQuizFiles frage34 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Nigeria? ",
                moeglicheAntworten1, "Abuja");

        GeneratingRandomQuizFiles frage35 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Ruanda? ",
                moeglicheAntworten1, "Kigali");

        GeneratingRandomQuizFiles frage36 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Sambia? ",
                moeglicheAntworten1, "Lusaka");

        GeneratingRandomQuizFiles frage37 = new GeneratingRandomQuizFiles(
                "Was ist die Hauptstadt von São Tomé und Príncipe? ",
                moeglicheAntworten1, "San Tome");

        GeneratingRandomQuizFiles frage38 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Senegal? ",
                moeglicheAntworten1, "Dakar");

        GeneratingRandomQuizFiles frage39 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Seychellen? ",
                moeglicheAntworten1, "Victoria");

        GeneratingRandomQuizFiles frage40 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Sierra Leone? ",
                moeglicheAntworten1, "Freetown ");

        GeneratingRandomQuizFiles frage41 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Simbabwe? ",
                moeglicheAntworten1, "Harare");

        GeneratingRandomQuizFiles frage42 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Somalia? ",
                moeglicheAntworten1, "Mogadischu");

        GeneratingRandomQuizFiles frage43 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Südafrika? ",
                moeglicheAntworten1, "Pretoria");

        GeneratingRandomQuizFiles frage44 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Sudan? ",
                moeglicheAntworten1, "Khartum");

        GeneratingRandomQuizFiles frage45 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Südsudan? ",
                moeglicheAntworten1, "Juba");

        GeneratingRandomQuizFiles frage46 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von  Tansania? ",
                moeglicheAntworten1, "Dodoma");

        GeneratingRandomQuizFiles frage47 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Togo? ",
                moeglicheAntworten1, "Lomé");

        GeneratingRandomQuizFiles frage48 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von  Aegypten? ",
                moeglicheAntworten1, "Kairo");

        GeneratingRandomQuizFiles frage49 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Argelien? ",
                moeglicheAntworten1, "Algier");

        GeneratingRandomQuizFiles frage50 = new GeneratingRandomQuizFiles("Was ist die Hauptstadt von Angola? ",
                moeglicheAntworten1, "Luanda");

        fragenoption.add(frage1);
        fragenoption.add(frage2);
        fragenoption.add(frage3);
        fragenoption.add(frage4);
        fragenoption.add(frage5);
        fragenoption.add(frage6);
        fragenoption.add(frage7);
        fragenoption.add(frage8);
        fragenoption.add(frage9);
        fragenoption.add(frage10);
        fragenoption.add(frage11);
        fragenoption.add(frage12);
        fragenoption.add(frage13);
        fragenoption.add(frage14);
        fragenoption.add(frage15);
        fragenoption.add(frage16);
        fragenoption.add(frage17);
        fragenoption.add(frage18);
        fragenoption.add(frage19);
        fragenoption.add(frage20);
        fragenoption.add(frage21);
        fragenoption.add(frage22);
        fragenoption.add(frage23);
        fragenoption.add(frage24);
        fragenoption.add(frage25);
        fragenoption.add(frage26);
        fragenoption.add(frage27);
        fragenoption.add(frage28);
        fragenoption.add(frage29);
        fragenoption.add(frage30);
        fragenoption.add(frage31);
        fragenoption.add(frage32);
        fragenoption.add(frage33);
        fragenoption.add(frage34);
        fragenoption.add(frage35);
        fragenoption.add(frage36);
        fragenoption.add(frage37);
        fragenoption.add(frage38);
        fragenoption.add(frage39);
        fragenoption.add(frage40);
        fragenoption.add(frage41);
        fragenoption.add(frage42);
        fragenoption.add(frage43);
        fragenoption.add(frage44);
        fragenoption.add(frage45);
        fragenoption.add(frage46);
        fragenoption.add(frage47);
        fragenoption.add(frage48);
        fragenoption.add(frage49);
        fragenoption.add(frage50);

        
        System.out.println(frage49.getFragen());

        // System.out.println(frage1.getMoeglichenAnworten());

        for (String ausgabe : moeglicheAntworten1) {
            System.out.println(ausgabe + "");
        }

        System.out.println("\nGeben Sie bitte Ihre Antwort ein: ");
        var antwortDesBenutzer = scanner.nextLine();

        boolean richtigAntwort = fragenoption.get(0).ueberpruefungAntwort(antwortDesBenutzer);

        if (richtigAntwort) {
            System.out.println("Deine antwort ist richtig");

        }

        // System.out.println(frage1); PARA VER QUE SE GUARDA EN CADA PREGUNTA

        scanner.close();

    }

    public String getFragen() {
        return fragen;
    }

    public List<String> getMoeglichenAnworten() {
        return moeglichenAnworten;
    }

    public String getRichtigeAntwort() {
        return richtigeAntwort;
    }

}

/*
 * Proyecto: Generación de archivos aleatorios de cuestionarios
 * 
 * Supongamos que eres un profesor de geografía con 35 alumnos en clase y
 * quieres hacer un examen sorpresa sobre las capitales de los paises de la
 * africanos.
 * 
 * Te gustaría aleatorizar el orden de las preguntas para que cada cuestionario
 * sea único.
 * 
 * Esto es lo que hace el programa:
 * 
 * 1-) Crea 35 cuestionarios diferentes.
 * 
 * 2-) Crea 50 preguntas de opción múltiple para cada cuestionario, en orden
 * aleatorio. Proporciona la respuesta correcta y tres respuestas incorrectas
 * aleatorias para cada pregunta, en orden aleatorio.
 * 
 * 4-) Escribe los cuestionarios en 35 archivos de texto.
 * 
 * 5-) Escribe las claves de respuesta en 35 archivos de texto.
 * 
 * Esto significa que el código tendrá que hacer lo siguiente:
 * 
 * a-) Almacena los estados y sus capitales en un diccionario.
 * 
 * b-) Llame a open(), write() y close () para los archivos de texto del
 * cuestionario y de la clave de respuestas. Utilice random. shuffle() para
 * aleatorizar el orden de las preguntas y las opciones de opción múltiple.
 */
