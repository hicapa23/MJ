package de.hansemerkur.victor.quizgenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QuizGenerator {
    public static void main(String[] args) {
        Map<String, String> länderUndHauptstädte = new HashMap<>();



        länderUndHauptstädte.put("Aegypten", "Kairo");
        länderUndHauptstädte.put("Argelien", "Algier");
        länderUndHauptstädte.put("Angola", "Luanda");
        länderUndHauptstädte.put("Aequatorialguinea", "Malabo");
        länderUndHauptstädte.put("Aethiopien", "Addis Abeda");
        länderUndHauptstädte.put("Benin", "Porto-Novo");
        länderUndHauptstädte.put("Porto-Novo", "Gaborone");
        länderUndHauptstädte.put("Burkina Faso", "Ouagadougou");
        länderUndHauptstädte.put("Burundi", "Bujumbura");
        länderUndHauptstädte.put("Dschibuti", "Dschibuti");
        länderUndHauptstädte.put("Elfenbeinküste", "Yamoussoukro");
        länderUndHauptstädte.put("Eritrea", "Asmara");
        länderUndHauptstädte.put("Eswatini", "Mbabane");
        länderUndHauptstädte.put("Gabun", "Libreville");
        länderUndHauptstädte.put("Gambia", "Banjul");
        länderUndHauptstädte.put("Ghana", "Accra");
        länderUndHauptstädte.put("Guinea", "Conakry");
        länderUndHauptstädte.put("Guinea-Bissau", "Bissau");
        länderUndHauptstädte.put("Kamerun", "Yaounde");
        länderUndHauptstädte.put("Kap Verde", "Praia");
        länderUndHauptstädte.put("Kenia", "Nairobi");
        länderUndHauptstädte.put("Komoren", "Moroni");
        länderUndHauptstädte.put("Kongo (Demokratische Republik)", "Kinshasa");
        länderUndHauptstädte.put("Kongo (Republik)", "Brazzaville");
        länderUndHauptstädte.put("esotho", "Maseru");
        länderUndHauptstädte.put("Liberia", "Monrovia");
        länderUndHauptstädte.put("Libyen", "Tripolis");
        länderUndHauptstädte.put("Madagaskar", "Antananarivo");
        länderUndHauptstädte.put("Malawi", "Lilongwe");
        länderUndHauptstädte.put("Mali", "Bamako");
        länderUndHauptstädte.put("Marokko", "Rabat");
        länderUndHauptstädte.put("Mauretanien", "Nouakchott");
        länderUndHauptstädte.put("Mauritius", "Port Louis");
        länderUndHauptstädte.put("Mosambik", "Maputo");
        länderUndHauptstädte.put("Namibia", "Windhoek");
        länderUndHauptstädte.put("Niger", "Niamey");
        länderUndHauptstädte.put("Nigeria", "Abuja");
        länderUndHauptstädte.put("Ruanda", "Kigali");
        länderUndHauptstädte.put("Sambia", "Lusaka");
        länderUndHauptstädte.put("São Tomé und Príncipe", "São Tomé");
        länderUndHauptstädte.put("Senegal", "Dakar");
        länderUndHauptstädte.put("Seychellen", "Victoria ");
        länderUndHauptstädte.put("Sierra Leone", "Freetown ");
        länderUndHauptstädte.put("Simbabwe", "Harare");
        länderUndHauptstädte.put("Somalia", "Mogadischu ");
        länderUndHauptstädte.put("Südafrika", "Pretoria");
        länderUndHauptstädte.put("Sudan", "Khartum");
        länderUndHauptstädte.put("Südsudan", "Juba");
        länderUndHauptstädte.put("Tansania", "Dodoma");
        länderUndHauptstädte.put("Togo", "Lomé");


        for (int fragenBogen = 1; fragenBogen <= 35; fragenBogen++) {
            List<String> länder = new ArrayList<>(länderUndHauptstädte.keySet());
            Collections.shuffle(länder);

            try (FileWriter fragenBogenWriter = new FileWriter("Fragenbogen_" + fragenBogen + ".txt");

                    FileWriter schlüsselAntwortWriter = new FileWriter("Schlussel_Antworten_" + fragenBogen + ".txt")) {

                for (int zahlFrage = 1; zahlFrage <= 50; zahlFrage++) {
                    String land = länder.get(zahlFrage - 1);
                    String richtigeHauptstad = länderUndHauptstädte.get(land);

                    List<String> falscheHauptstadt = new ArrayList<>(länderUndHauptstädte.values());
                    falscheHauptstadt.remove(richtigeHauptstad);
                    Collections.shuffle(falscheHauptstadt);
                    falscheHauptstadt = falscheHauptstadt.subList(0, 3);

                    List<String> optionen = new ArrayList<>(falscheHauptstadt);
                    optionen.add(richtigeHauptstad);
                    Collections.shuffle(optionen);

                    fragenBogenWriter.write("Frage " + zahlFrage + ": Wie heißt die Hauptstat von " + land +  "?\n");

                    for (int i = 0; i < 4; i++) {
                        fragenBogenWriter.write("ABCD".charAt(i) + ". " + optionen.get(i) + "\n");
                    }
                    fragenBogenWriter.write("\n");

                    schlüsselAntwortWriter
                            .write(zahlFrage + ". " + "ABCD".charAt(optionen.indexOf(richtigeHauptstad)) + "\n");
                }
            } catch (IOException e) {
                System.out.println("Fehler aufgetreten" + e.getMessage());
            }
        }
    }
}
