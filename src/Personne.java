public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected double age;
    protected String email;

    public Personne(String prenom, String email, double age, String nom) {
        this.prenom = prenom;
        this.email = email;
        this.age = age;
        this.nom = nom;
    }

    public String getBaseDesc(){
        String description = nom + " " +  prenom + ", age : " + age + " email : " + email;
        return description;
    }

    public abstract String getRole();

    public String printDesc(){
        String description = getBaseDesc() + " | " + getRole();
        return description;
    }

}
