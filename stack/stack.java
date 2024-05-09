package stack;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Création d'une pile
        Stack<String> stack = new Stack<>();

        // Ajout d'éléments à la pile
        stack.push("Premier");
        stack.push("Deuxième");
        stack.push("Troisième");

        // Affichage de la pile
        System.out.println("Pile : " + stack);

        // Retrait de l'élément en haut de la pile
        String topElement = stack.pop();
        System.out.println("Élément retiré de la pile : " + topElement);

        // Affichage de la pile après retrait
        System.out.println("Pile après retrait : " + stack);

        // Accès à l'élément en haut de la pile sans le retirer
        String peekElement = stack.peek();
        System.out.println("Prochain élément à sortir de la pile : " + peekElement);

        // Taille de la pile
        int size = stack.size();
        System.out.println("Taille de la pile : " + size);

        // Vérification si la pile est vide
        boolean isEmpty = stack.isEmpty();
        System.out.println("La pile est vide : " + isEmpty);
    }
}


