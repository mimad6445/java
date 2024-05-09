package Queue;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        // Création d'une file de priorité (PriorityQueue) de chaînes de caractères
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Ajout d'éléments à la file de priorité
        priorityQueue.offer(5);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(9);
        // Affichage de la file de priorité
        System.out.println("File de priorité : " + priorityQueue);

        // Retrait de l'élément en tête de la file de priorité
        int firstElement = priorityQueue.poll();
        System.out.println("Élément retiré de la file de priorité : " + firstElement);
        System.out.println("Élément retiré de la file de priorité : " + priorityQueue.poll());
        // Affichage de la file de priorité après retrait
        System.out.println("File de priorité après retrait : " + priorityQueue);

        // Affichage de l'élément en tête de la file de priorité sans le retirer
        int peekElement = priorityQueue.peek();
        System.out.println("Prochain élément à sortir de la file de priorité : " + peekElement);

        // Retrait d'un élément spécifique de la file de priorité
        boolean removed = priorityQueue.remove(4);
        System.out.println("Élément 'Orange' retiré de la file de priorité : " + removed);
        System.out.println("File de priorité après retrait de 'Orange' : " + priorityQueue);

        // Taille de la file de priorité
        int size = priorityQueue.size();
        System.out.println("Taille de la file de priorité : " + size);

        // Vérification si la file de priorité est vide
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("La file de priorité est vide : " + isEmpty);

        // Effacer la file de priorité
        priorityQueue.clear();
        System.out.println("File de priorité après effacement : " + priorityQueue);
    }
}
