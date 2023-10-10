package Cadenas.src;

import java.util.*;

public class EX11 {
    public static void main(String[] args) {

        HashMap<String, Integer> players = new HashMap<>();
        players.put("Lebron", 23);
        players.put("Kobe", 24);
        players.put("Shaq", 34);
        players.put("Jordan", 23);
        players.put("Rose", 1);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(players.entrySet());

        Comparator<Map.Entry<String, Integer>> comparator = (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue());
        Collections.sort(list, comparator);

        TreeMap<String, Integer> playersSorted = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            playersSorted.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : playersSorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }  
}
