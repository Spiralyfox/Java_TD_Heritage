public class Administratif extends Employe{


    public Administratif(String prenom, String email, double age, String nom, double salaire) {
        super(prenom, email, age, nom, salaire);
    }

    @Override
    public String getRole() {
        return "personnel administratif";
    }
}
