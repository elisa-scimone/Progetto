package progetto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task_1 {
    public static void Task_1(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int numZone = Integer.parseInt(line[0]);
        int numStallaggi = Integer.parseInt(line[1]);

        HashMap<String, Integer> zoneAdiacenti = new HashMap<>();
        for (int i = 0 ; i < numZone; i++){
            line = scanner.nextLine().split(" ");
            String zone = line[0];
            String[] adiacenti = line[1].split(" ");
            zoneAdiacenti.put(zone, ArrayList(adiacenti));
        }
}
