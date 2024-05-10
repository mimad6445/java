package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> populationMap = new HashMap<>();

        // Add elements to the HashMap
        populationMap.put("USA", 328_200_000);
        populationMap.put("China", 1_393_000_000);
        populationMap.put("India", 1_366_400_000);

        // Get the Set of entries from the map
        Set<Map.Entry<String, Integer>> entries = populationMap.entrySet();

        // Print the key-value pairs
        System.out.println("Key-Value pairs in the population map:");
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Modify the map through the entrySet
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().equals("India")) {
                entry.setValue(1_380_004_385); // Update the population of India
            }
        }

        // Print the modified map
        System.out.println("Population map after updating 'India':");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
