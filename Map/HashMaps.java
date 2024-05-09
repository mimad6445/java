package Map;

import java.util.Map;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // Create a HashMap with key-value pairs of String keys and Integer values
        Map<String, Integer> populationMap = new HashMap<>();

        // Add elements to the HashMap
        populationMap.put("USA", 328_200_000);
        populationMap.put("China", 1_393_000_000);
        populationMap.put("India", 1_366_400_000);
        populationMap.put("Brazil", 211_000_000);

        // Access elements in the HashMap
        int usaPopulation = populationMap.get("USA");
        System.out.println("Population of USA: " + usaPopulation);

        // Update value associated with a key
        populationMap.put("USA", 331_000_000); // Updating population of USA
        usaPopulation = populationMap.get("USA");
        System.out.println("Updated population of USA: " + usaPopulation);

        // Check if a key exists in the HashMap
        boolean containsIndia = populationMap.containsKey("India");
        System.out.println("Does the map contain India? " + containsIndia);

        // Remove an entry from the HashMap
        Integer removedPopulation = populationMap.remove("Brazil");
        System.out.println("Removed population of Brazil: " + removedPopulation);

        // Check the size of the HashMap
        int size = populationMap.size();
        System.out.println("Size of the population map: " + size);

        // Iterate over the entries of the HashMap
        System.out.println("Population of each country:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            String country = entry.getKey();
            int population = entry.getValue();
            System.out.println(country + ": " + population);
        }
    }
}

