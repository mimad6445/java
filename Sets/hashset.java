package Sets;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("apple"); // Duplicate elements are not allowed

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists in the HashSet
        boolean containsOrange = hashSet.contains("orange");
        System.out.println("Contains orange? " + containsOrange);

        // Remove an element from the HashSet
        boolean removed = hashSet.remove("banana");
        System.out.println("Removed banana? " + removed);
        System.out.println("HashSet after removal: " + hashSet);

        // Iterate over the elements of the HashSet
        System.out.println("Elements of HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
