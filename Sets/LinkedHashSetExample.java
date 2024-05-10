package Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("apple"); // Duplicate elements are not allowed

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element exists in the LinkedHashSet
        boolean containsOrange = linkedHashSet.contains("orange");
        System.out.println("Contains orange? " + containsOrange);

        // Remove an element from the LinkedHashSet
        boolean removed = linkedHashSet.remove("banana");
        System.out.println("Removed banana? " + removed);
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);

        // Iterate over the elements of the LinkedHashSet
        System.out.println("Elements of LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Get the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Check if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
