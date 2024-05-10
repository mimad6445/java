package Sets;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {
        // Create a SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();

        // Add elements to the SortedSet
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("grape");
        sortedSet.add("orange");
        sortedSet.add("cherry");

        // Print the sorted set
        System.out.println("Sorted Set: " + sortedSet);

        // Retrieve and remove the first and last elements
        String first = sortedSet.first();
        System.out.println("First element: " + first);
        String last = sortedSet.last();
        System.out.println("Last element: " + last);

        // HeadSet: Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) to the specified element.
        SortedSet<String> headSet = sortedSet.headSet("orange");
        System.out.println("Head Set (less than orange): " + headSet);

        // TailSet: Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) to the specified element.
        SortedSet<String> tailSet = sortedSet.tailSet("orange");
        System.out.println("Tail Set (greater than or equal to orange): " + tailSet);

        // SubSet: Returns a view of the portion of this set whose elements range from fromElement to toElement.
        SortedSet<String> subSet = sortedSet.subSet("apple", "orange");
        System.out.println("Sub Set (between apple and orange): " + subSet);
    }
}
