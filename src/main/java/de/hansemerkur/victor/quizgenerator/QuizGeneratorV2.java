package de.hansemerkur.victor.quizgenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class QuizGeneratorV2 {
    public static void main(String[] args) {

        Map<String, String> laenderUndHauptstaedte = new HashMap<>();

        laenderUndHauptstaedte.put("Aegypten", "Kairo");
        laenderUndHauptstaedte.put("Argelien", "Algier");
        laenderUndHauptstaedte.put("Angola", "Luanda");
        laenderUndHauptstaedte.put("Aequatorialguinea", "Malabo");
        laenderUndHauptstaedte.put("Aethiopien", "Addis Abeda");
        laenderUndHauptstaedte.put("Benin", "Porto-Novo");
        laenderUndHauptstaedte.put("Porto-Novo", "Gaborone");
        laenderUndHauptstaedte.put("Burkina Faso", "Ouagadougou");
        laenderUndHauptstaedte.put("Burundi", "Bujumbura");
        laenderUndHauptstaedte.put("Dschibuti", "Dschibuti");
        laenderUndHauptstaedte.put("Elfenbeinküste", "Yamoussoukro");
        laenderUndHauptstaedte.put("Eritrea", "Asmara");
        laenderUndHauptstaedte.put("Eswatini", "Mbabane");
        laenderUndHauptstaedte.put("Gabun", "Libreville");
        laenderUndHauptstaedte.put("Gambia", "Banjul");
        laenderUndHauptstaedte.put("Ghana", "Accra");
        laenderUndHauptstaedte.put("Guinea", "Conakry");
        laenderUndHauptstaedte.put("Guinea-Bissau", "Bissau");
        laenderUndHauptstaedte.put("Kamerun", "Yaounde");
        laenderUndHauptstaedte.put("Kap Verde", "Praia");
        laenderUndHauptstaedte.put("Kenia", "Nairobi");
        laenderUndHauptstaedte.put("Komoren", "Moroni");
        laenderUndHauptstaedte.put("Kongo (Demokratische Republik)", "Kinshasa");
        laenderUndHauptstaedte.put("Kongo (Republik)", "Brazzaville");
        laenderUndHauptstaedte.put("esotho", "Maseru");
        laenderUndHauptstaedte.put("Liberia", "Monrovia");
        laenderUndHauptstaedte.put("Libyen", "Tripolis");
        laenderUndHauptstaedte.put("Madagaskar", "Antananarivo");
        laenderUndHauptstaedte.put("Malawi", "Lilongwe");
        laenderUndHauptstaedte.put("Mali", "Bamako");
        laenderUndHauptstaedte.put("Marokko", "Rabat");
        laenderUndHauptstaedte.put("Mauretanien", "Nouakchott");
        laenderUndHauptstaedte.put("Mauritius", "Port Louis");
        laenderUndHauptstaedte.put("Mosambik", "Maputo");
        laenderUndHauptstaedte.put("Namibia", "Windhoek");
        laenderUndHauptstaedte.put("Niger", "Niamey");
        laenderUndHauptstaedte.put("Nigeria", "Abuja");
        laenderUndHauptstaedte.put("Ruanda", "Kigali");
        laenderUndHauptstaedte.put("Sambia", "Lusaka");
        laenderUndHauptstaedte.put("São Tomé und Príncipe", "São Tomé");
        laenderUndHauptstaedte.put("Senegal", "Dakar");
        laenderUndHauptstaedte.put("Seychellen", "Victoria ");
        laenderUndHauptstaedte.put("Sierra Leone", "Freetown ");
        laenderUndHauptstaedte.put("Simbabwe", "Harare");
        laenderUndHauptstaedte.put("Somalia", "Mogadischu ");
        laenderUndHauptstaedte.put("Südafrika", "Pretoria");
        laenderUndHauptstaedte.put("Sudan", "Khartum");
        laenderUndHauptstaedte.put("Südsudan", "Juba");
        laenderUndHauptstaedte.put("Tansania", "Dodoma");
        laenderUndHauptstaedte.put("Togo", "Lomé");

        IntStream.range(1, 36).forEach(n -> {

            List<String> laender = new ArrayList<>(laenderUndHauptstaedte.keySet());
            Collections.shuffle(laender);

            try (FileWriter fragenBogenWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV2\\Fragenbogen_" + n + ".txt");

                 FileWriter schluesselAntwortWriter = new FileWriter("C:\\Users\\victo\\Desktop\\Programacion\\Java\\jv_ersten_programe_in_der_hanse\\src\\main\\resources\\QuizGeneratorV2\\Schlussel_Antworten_" + n + ".txt")) {

                IntStream.range(1, laenderUndHauptstaedte.size()).forEach(zahlFrage -> {

                    String land = laender.get(zahlFrage - 1);
                    String richtigeHauptstad = laenderUndHauptstaedte.get(land);

                    List<String> falscheHauptstadt = new ArrayList<>(laenderUndHauptstaedte.values());
                    falscheHauptstadt.remove(richtigeHauptstad);
                    Collections.shuffle(falscheHauptstadt);
                    falscheHauptstadt = falscheHauptstadt.subList(0, 3);

                    List<String> optionen = new ArrayList<>(falscheHauptstadt);
                    optionen.add(richtigeHauptstad);
                    Collections.shuffle(optionen);

                    try {
                        fragenBogenWriter.write("Frage " + zahlFrage + ": Wie heißt die Hauptstat von " + land + "?\n");

                        IntStream.range(0, 4).forEach(i -> {

                            try {
                                fragenBogenWriter.write("ABCD".charAt(i) + ". " + optionen.get(i) + "\n");

                            } catch (IOException e) {
                                e.printStackTrace(System.out);

                            }
                        });

                        fragenBogenWriter.write(System.lineSeparator());

                        schluesselAntwortWriter
                                .write(zahlFrage + ". " + "ABCD".charAt(optionen.indexOf(richtigeHauptstad)) + "\n");
                    } catch (IOException e) {
                        System.out.println("Fehler aufgetreten" + e.getMessage());
                    }
                });
            } catch (IOException e) {
                System.out.println("Fehler aufgetreten" + e.getMessage());
            }
        });
    }
}

