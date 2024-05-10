package Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class arrayblokingqueue {
    public static void main(String[] args) {
        // Create an ArrayBlockingQueue with capacity of 3
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        
        // Add elements to the queue
        
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
        boolean addMore = queue.offer(4);
        if (addMore) {
            System.out.println("Add Sucessfull");
        } else {
            System.out.println("Can't add the queue Completed");
        }
    }
}
