package de.hansemerkur.victor.quizgenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class QuizGeneratorV3 {

    public static void main(String[] args) {

        var laenderUndHauptstaedte = new HashMap<String, String>();

        List<String> keys = Arrays.asList("Aegypten", "Argelien", "Angola", "Aequatorialguinea", "Aethiopien", "Benin",
                "Porto-Novo", "Burkina Faso", "Burundi", "Dschibuti", "Elfenbeinküste", "Eritrea", "Eswatini", "Gabun",
                "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kamerun", "Kap Verde", "Kenia", "Komoren",
                "Kongo (Demokratische Republik)", "Kongo (Republik)", "esotho", "Liberia", "Libyen", "Madagaskar",
                "Malawi", "Mali", "Marokko", "Mauretanien", "Mauritius", "Mosambik", "Namibia", "Niger", "Nigeria",
                "Ruanda", "Sambia", "São Tomé und Príncipe", "Senegal", "Seychellen", "Sierra Leone", "Simbabwe",
                "Somalia", "Südafrika", "Sudan", "Südsudan", "Tansania", "Togo");

        List<String> values = Arrays.asList("Kairo", "Algier", "Luanda", "Malabo", "Addis Abeda", "Porto-Novo",
                "Gaborone", "Ouagadougou", "Bujumbura", "Dschibuti", "Yamoussoukro", "Asmara", "Mbabane", "Libreville",
                "Banjul", "Accra", "Conakry", "Bissau", "Yaounde", "Praia", "Nairobi", "Moroni", "Kinshasa",
                "Brazzaville", "Maseru", "Monrovia", "Tripolis", "Antananarivo", "Lilongwe", "Bamako", "Rabat",
                "Nouakchott", "Port Louis", "Maputo", "Windhoek", "Niamey", "Abuja", "Kigali", "Lusaka", "São Tomé",
                "Dakar", "Victoria ", "Freetown ", "Harare", "Mogadischu ", "Pretoria", "Khartum", "Juba", "Dodoma",
                "Lomé");

        IntStream.range(0, keys.size()).forEach(i -> laenderUndHauptstaedte.put(keys.get(i), values.get(i)));

        IntStream.range(1, 36).forEach(n -> {

            List<String> laender = new ArrayList<>(laenderUndHauptstaedte.keySet());
            Collections.shuffle(laender);

            try (FileWriter fragenBogenWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV3\\Fragenbogen_" + n + ".txt");

                    FileWriter schluesselAntwortWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV3\\Schlussel_Antworten_" + n + ".txt")) {

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

                    schluesselAntwortWriter
                            .write(zahlFrage + ". " + "ABCD".charAt(optionen.indexOf(richtigeHauptstad)) + "\n");
                }
            } catch (IOException e) {
                System.out.println("Fehler aufgetreten" + e.getMessage());
            }
        });
    }
}
