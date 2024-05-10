package Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class iterator3 {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Get the collection of values from the map
        Collection<Integer> values = map.values();

        // Iterate over the values using a for-each loop
        for (Integer value : values) {
            System.out.println("Value: " + value);
        }
    }
}
