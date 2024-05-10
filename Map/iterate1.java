package Map;
import java.util.Map;
import java.util.HashMap;

public class iterate1 {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Iterate over the map using entrySet() and for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
