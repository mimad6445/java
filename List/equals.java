package List;
import java.util.ArrayList;
import java.util.List;

public class equals {
    public static void main(String[] args) {
        // Create two ArrayLists with the same elements in the same order
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Apple");

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        // list1.remove("Apple");
        List<String> list3 = new ArrayList<>();
        list3.add("Orange");
        list3.add("Apple");
        list3.add("Banana");

        // Compare the two lists using equals()
        boolean areEqualot = list1.equals(list2);
        System.out.println("Are the lists equal? " + areEqualot);
        boolean areEqualoth = list1.equals(list3);
        System.out.println("Are the lists equal? " + areEqualoth); // Output: true
    }
}
