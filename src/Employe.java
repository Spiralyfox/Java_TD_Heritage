public abstract class Employe extends Personne{
    protected double salaire;

    public Employe(String prenom, String email, double age, String nom, double salaire) {
        super(prenom, email, age, nom);
        this.salaire = salaire;
    }
}
