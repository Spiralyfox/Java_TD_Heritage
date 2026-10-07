import java.util.ArrayList;

public class Ecole {
    private ArrayList<Personne> personne = new ArrayList<Personne>();

    public Ecole(ArrayList<Personne> personne) {
        this.personne = personne;
    }

    public void addPersonne(Personne a){
        personne.add(a);
    }

    public void afficherPersonnes() {
        for (Personne p : personne) {
            System.out.println(p.printDesc());
        }
    }
}
