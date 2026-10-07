import java.util.ArrayList;

public class Etudiant extends Personne{
    private ArrayList<String> cours = new ArrayList<String>();

    public Etudiant(String prenom, String email, double age, String nom) {
        super(prenom, email, age, nom);
    }

    public void ajouterCours(String c) {
        cours.add(c);
    }

    public String afficherCours(){
        String allcours = "";
        for (String a : cours){
            allcours += a + "\n";
        }
        return allcours;
    }


    @Override
    public String getRole() {
        String liste = "";
        for (String c : cours) {
            liste += c + " ";
        }
        return "Étudiant inscrit aux cours de " + liste;
    }
}
