package List;
import java.util.ArrayList;
import java.util.List;

public class sublist {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");
        originalList.add("Mango");

        // Get a sublist from index 1 (inclusive) to index 4 (exclusive)
        List<String> sublist = originalList.subList(1, 4);

        // Print the original list
        System.out.println("Original list: " + originalList);

        // Print the sublist
        System.out.println("Sublist: " + sublist);

        // Modify the sublist
        sublist.set(1, "Pineapple");

        // Print the modified sublist
        System.out.println("Modified sublist: " + sublist);

        // Print the original list again
        System.out.println("Original list after modification: " + originalList);
    }
}
