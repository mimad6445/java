package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrieMelenge {
    public static void main(String[] args) {
        // Création d'une liste d'exemple
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);

        // Trier la liste
        Collections.sort(numbers);
        System.out.println("Liste triée : " + numbers);

        // Mélanger la liste
        Collections.shuffle(numbers);
        System.out.println("Liste mélangée : " + numbers);
    }
}
