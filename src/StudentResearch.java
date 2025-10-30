import java.util.ArrayList;
import java.util.Scanner;


public class StudentResearch {

	public static void main(String[] args) {
		 ArrayList<StudentIs> studentsList = new ArrayList<>();
	        Scanner scanr = new Scanner(System.in);

	        // Création d'une liste d'élèves de test
	        studentsList.add(new StudentIs("Dupont", "Jean", new double[]{12, 15, 14}));
	        studentsList.add(new StudentIs("Martin", "Marie", new double[]{18, 16, 17}));
	        studentsList.add(new StudentIs("Bernard", "Pierre", new double[]{10, 12, 11}));

	        System.out.print("Entrez le nom de l'élève à rechercher: ");
	        String researchName = scanr.nextLine();

	        System.out.print("Entrez le prénom de l'élève à rechercher: ");
	        String researchFisrtname = scanr.nextLine();

	        boolean find = false;
	        for (StudentIs study : studentsList) {
	            if (study.getLastname().equalsIgnoreCase(researchName) &&
	                study.getFirstname().equalsIgnoreCase(researchFisrtname)) {

	                find = true;
	                System.out.println("\nÉlève trouvé !");
	                System.out.println("Nom: " + study.getLastname());
	                System.out.println("Prénom: " + study.getFirstname());

	                System.out.print("Notes: ");
	                for (double note : study.getNotes()) {
	                    System.out.print(note + " ");
	                }

	                System.out.println("\nMoyenne: " + study.calculateAverage());
	                break;
	            }
	        }

	        if (!find) {
	          System.out.println("Élève non trouvé dans la liste.");
	        }

	        scanr.close();

	}

}
