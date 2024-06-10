package de.hansemerkur.victor.quizgenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class QuizGeneratorV1 {
    public static void main(String[] args) {

        //Map<String, String> laenderUndHauptstaedte = new HashMap<>(Map.ofEntries(
        
        var laenderUndHauptstaedte = Map.ofEntries(

                Map.entry("Aegypten", "Kairo"),
                Map.entry("Argelien", "Algier"),
                Map.entry("Angola", "Luanda"),
                Map.entry("Aequatorialguinea", "Malabo"),
                Map.entry("Aethiopien", "Addis Abeda"),
                Map.entry("Benin", "Porto-Novo"),
                Map.entry("Porto-Novo", "Gaborone"),
                Map.entry("Burkina Faso", "Ouagadougou"),
                Map.entry("Burundi", "Bujumbura"),
                Map.entry("Dschibuti", "Dschibuti"),
                Map.entry("Elfenbeinküste", "Yamoussoukro"),
                Map.entry("Eritrea", "Asmara"),
                Map.entry("Eswatini", "Mbabane"),
                Map.entry("Gabun", "Libreville"),
                Map.entry("Gambia", "Banjul"),
                Map.entry("Ghana", "Accra"),
                Map.entry("Guinea", "Conakry"),
                Map.entry("Guinea-Bissau", "Bissau"),
                Map.entry("Kamerun", "Yaounde"),
                Map.entry("Kap Verde", "Praia"),
                Map.entry("Kenia", "Nairobi"),
                Map.entry("Komoren", "Moroni"),
                Map.entry("Kongo (Demokratische Republik)", "Kinshasa"),
                Map.entry("Kongo (Republik)", "Brazzaville"),
                Map.entry("esotho", "Maseru"),
                Map.entry("Liberia", "Monrovia"),
                Map.entry("Libyen", "Tripolis"),
                Map.entry("Madagaskar", "Antananarivo"),
                Map.entry("Malawi", "Lilongwe"),
                Map.entry("Mali", "Bamako"),
                Map.entry("Marokko", "Rabat"),
                Map.entry("Mauretanien", "Nouakchott"),
                Map.entry("Mauritius", "Port Louis"),
                Map.entry("Mosambik", "Maputo"),
                Map.entry("Namibia", "Windhoek"),
                Map.entry("Niger", "Niamey"),
                Map.entry("Nigeria", "Abuja"),
                Map.entry("Ruanda", "Kigali"),
                Map.entry("Sambia", "Lusaka"),
                Map.entry("São Tomé und Príncipe", "São Tomé"),
                Map.entry("Senegal", "Dakar"),
                Map.entry("Seychellen", "Victoria "),
                Map.entry("Sierra Leone", "Freetown "),
                Map.entry("Simbabwe", "Harare"),
                Map.entry("Somalia", "Mogadischu "),
                Map.entry("Südafrika", "Pretoria"),
                Map.entry("Sudan", "Khartum"),
                Map.entry("Südsudan", "Juba"),
                Map.entry("Tansania", "Dodoma"),
                Map.entry("Togo", "Lomé")
        );


        IntStream.range(1, 36).forEach(n -> {

            List<String> laender = new ArrayList<>
            (laenderUndHauptstaedte.keySet());
            Collections.shuffle(laender);

            try (FileWriter fragenBogenWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV1\\Fragenbogen_" + n +
                    ".txt");

                 FileWriter schluesselAntwortWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV1\\Schlussel_Antworten_" + n + ".txt")) {

                for (int zahlFrage = 1; zahlFrage <= laenderUndHauptstaedte.size(); zahlFrage++) {
                    String land = laender.get(zahlFrage - 1);
                    String richtigeHauptstad = laenderUndHauptstaedte.get(land);

                    List<String> falscheHauptstadt = new ArrayList<>(laenderUndHauptstaedte.values());
                    falscheHauptstadt.remove(richtigeHauptstad);
                    Collections.shuffle(falscheHauptstadt);
                    falscheHauptstadt = falscheHauptstadt.subList(0, 3);

                    List<String> optionen = new ArrayList<>(falscheHauptstadt);
                    optionen.add(richtigeHauptstad);
                    Collections.shuffle(optionen);

                    fragenBogenWriter.write("Frage " + zahlFrage + ": Wie heißt die Hauptstat von " + land + "?\n");

                    for (int i = 0; i < 4; i++) {
                        fragenBogenWriter.write("ABCD".charAt(i) + ". " + optionen.get(i) + "\n");
                    }
                    fragenBogenWriter.write(System.lineSeparator());

                    schluesselAntwortWriter.write(zahlFrage + ". " + "ABCD".charAt(optionen.indexOf(richtigeHauptstad)) + "\n");
                }
            } catch (IOException e) {
                System.out.println("Fehler aufgetreten" + e.getMessage());
            }
        });
    }
}
