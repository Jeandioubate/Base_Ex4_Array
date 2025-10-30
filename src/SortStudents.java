import java.util.Arrays;
import java.util.Collections;


public class SortStudents {

	public static void main(String[] args) {
		 // Liste des prénoms de la promotion
        String[] firstName = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};

        // Tri dans l'ordre décroissant
        Arrays.sort(firstName, Collections.reverseOrder());
        System.out.println("Ordre décroissant:");
        for (String firstN : firstName) {
            System.out.println(firstN);
        }

        System.out.println("\n---\n");

        // Tri dans l'ordre croissant
        Arrays.sort(firstName);
        System.out.println("Ordre croissant:");
        for (String firstN : firstName) {
            System.out.println(firstN);
        }

        // Version avec ArrayList
        System.out.println("\n--- Avec ArrayList ---");
        java.util.ArrayList<String> firstnameList = new java.util.ArrayList<>();
        Collections.addAll(firstnameList, firstName);

        // Ordre décroissant
        Collections.sort(firstnameList, Collections.reverseOrder());
        System.out.println("ArrayList - Ordre décroissant: " + firstnameList);

        // Ordre croissant
        Collections.sort(firstnameList);
        System.out.println("ArrayList - Ordre croissant: " + firstnameList);

	}

}
