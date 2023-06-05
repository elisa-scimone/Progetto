import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Progetto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        int numZone = 0;
        int numStallaggi = 0;
        HashMap<String, Zona> zoneMap = new HashMap<>();
        List<Stallaggio> stallaggi = new ArrayList<>();

        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        numZone = Integer.parseInt(tokens[0]);
        numStallaggi = Integer.parseInt(tokens[1]);

        for (int i = 0; i < numZone; i++) {
            line = scanner.nextLine();
            tokens = line.split(" ");
            String zonaCodice = tokens[0];
            Zona zona = new Zona(zonaCodice);
            List<Zona> adiacenti = new ArrayList<>();
            for (int j = 2; j < tokens.length; j++) {
                String adiacenteCodice = tokens[j];
                Zona adiacente = zoneMap.get(adiacenteCodice);
                if (adiacente == null) {
                    adiacente = new Zona(adiacenteCodice);
                    zoneMap.put(adiacenteCodice, adiacente);
                }
                adiacenti.add(adiacente);
            }
            zona.getAdiacenti().addAll(adiacenti);
            zoneMap.put(zonaCodice, zona);
        }

        for (int i = 0; i < numStallaggi; i++) {
            line = scanner.nextLine();
            tokens = line.split(" ");
            String codice = tokens[0];
            String zonaCodice = tokens[1];
            Zona zona = zoneMap.get(zonaCodice);
            String stato = tokens[2];
            String tipo = tokens[3];
            int tecnici = Integer.parseInt(tokens[4]);
            int carpentieri = Integer.parseInt(tokens[5]);
            int falegnami = Integer.parseInt(tokens[6]);

            Stallaggio stallaggio = new Stallaggio(codice, zona, stato, tipo, tecnici, carpentieri, falegnami);
            stallaggi.add(stallaggio);
            zona.getStallaggi().add(stallaggio);
        }

        System.out.println(numZone + " " + numStallaggi);
    }
}
