package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class keySet {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> populationMap = new HashMap<>();

        // Add elements to the HashMap
        populationMap.put("USA", 328_200_000);
        populationMap.put("China", 1_393_000_000);
        populationMap.put("India", 1_366_400_000);

        // Get the Set of keys from the map
        Set<String> keys = populationMap.keySet();

        // Print the keys
        System.out.println("Keys in the population map:");
        for (String key : keys) {
            System.out.println(key);
        }

        // Modify the map through the keySet
        keys.remove("India"); // This removes the key "India" and its associated value from the map

        // Print the modified map
        System.out.println("Population map after removing 'India':");
        for (String key : keys) {
            System.out.println(key + ": " + populationMap.get(key));
        }
    }
}
