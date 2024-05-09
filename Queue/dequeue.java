package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class dequeue {
    public static void main(String[] args) {
        // Create a Deque (double-ended queue) using LinkedList
        Deque<Integer> deque = new LinkedList<>();

        // Add elements at both ends of the deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(0);
        deque.offerLast(3);
        
        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove elements from both ends of the deque
        int firstElement = deque.removeFirst();
        int lastElement = deque.pollLast();

        // Print the removed elements
        System.out.println("First element removed: " + firstElement);
        System.out.println("Last element removed: " + lastElement);

        // Print the deque after removals
        System.out.println("Deque after removals: " + deque);
    }
}

