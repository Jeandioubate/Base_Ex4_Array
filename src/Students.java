
import java.util.ArrayList;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner scanr = new Scanner(System.in);
        ArrayList<StudentIs> studentsList = new ArrayList<>();

        System.out.print("Combien d'élèves voulez-vous saisir ? : ");
        int nbStudent = scanr.nextInt();
        scanr.nextLine(); // consommer le retour à la ligne

        for (int i = 0; i < nbStudent; i++) {
            System.out.println("\n--- Saisie de l'élève " + (i+1) + " ---");

            System.out.print("Nom: ");
            String lastName = scanr.nextLine();

            System.out.print("Prénom: ");
            String firstName = scanr.nextLine();

            System.out.print("Combien de notes pour cet élève ? : ");
            int nbNotes = scanr.nextInt();

            double[] notes = new double[nbNotes];
            for (int j = 0; j < nbNotes; j++) {
                System.out.print("Note " + (j+1) + ": ");
                notes[j] = scanr.nextDouble();
            }
            scanr.nextLine(); // consommer le retour à la ligne

            StudentIs study = new StudentIs(lastName, firstName, notes);
            studentsList.add(study);

            // Afficher les informations de l'élève
            System.out.println("\n" + study.getFirstname() + " " + study.getLastname() +
                             " - Moyenne: " + study.calculateAverage());
        }

        scanr.close();

	}

}

class StudentIs {
    private String lastName;
    private String firstName;
    private double[] notes;

    public StudentIs(String nom, String prenom, double[] notes) {
        this.lastName = nom;
        this.firstName = prenom;
        this.notes = notes;
    }

    public double calculateAverage() {
        return Array.calculateAverage(notes);
    }

    // Getters
    public String getLastname() { return lastName; }
    public String getFirstname() { return firstName; }
    public double[] getNotes() { return notes; }

}
