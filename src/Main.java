import java.util.ArrayList;

void main() {
    Ecole e = new Ecole(new ArrayList<>());

    Etudiant e1 = new Etudiant("Alice", "alice@meow.fr", 20, "Merveille");
    e1.ajouterCours("Java");
    e1.ajouterCours("Python");

    Etudiant e2 = new Etudiant("Bob", "bob@meow.fr", 22, "Bob");
    e2.ajouterCours("HTML");

    Professeur p1 = new Professeur("Charles", "charles@meow.fr", 45, "Magne", 2000.0);
    p1.ajouterCours("JS");
    p1.ajouterCours("PHP");

    Administratif a1 = new Administratif("Diane", "diane@meow.fr", 35, "Sanchez", 1800.0);

    e.addPersonne(e1);
    e.addPersonne(e2);
    e.addPersonne(p1);
    e.addPersonne(a1);

    e.afficherPersonnes();
}
