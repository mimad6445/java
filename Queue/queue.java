package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Ajout d'éléments à la file d'attente
        queue.offer("Premier");
        queue.offer("Deuxième");
        queue.offer("Troisième");

        // Affichage de la file d'attente
        System.out.println("Contenu de la file d'attente : " + queue);

        // Retrait de l'élément en tête de la file d'attente
        String firstElement = queue.poll();
        System.out.println("Élément retiré de la file d'attente : " + firstElement);

        // Affichage de la file d'attente après retrait
        System.out.println("Contenu de la file d'attente après retrait : " + queue);
    }
}
