package List;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExm {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        
        ListIterator<String> iterator = list.listIterator();
        
        // Forward traversal
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
        
        // Backward traversal and modification
        while(iterator.hasPrevious()) {
            String element = iterator.previous();
            if (element.equals("Banana")) {
                iterator.set("Mango"); // Replace "Banana" with "Mango"
            }
        }
        
        // Print the modified list
        System.out.println("Modified list: " + list);
    }
}
