package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue2 {
    public static void main(String[] args) {
        // Create a Deque (double-ended queue) using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();
        // Add elements at both ends of the deque
        deque.addFirst(0);
        deque.addLast(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.offerFirst(6);
        deque.offerLast(7);
        
        
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
