import java.util.ArrayList;

public class Professeur extends Employe{
    protected ArrayList<String> listeDeCours = new ArrayList<String>();


    public Professeur(String prenom, String email, double age, String nom, double salaire) {
        super(prenom, email, age, nom, salaire);
    }

    public void ajouterCours(String c) {
        listeDeCours.add(c);
    }

    @Override
    public String getRole() {
        String liste = "";
        for (String c : listeDeCours) {
            liste += c + " ";
        }
        return "Enseigne en " + liste;
    }
}
