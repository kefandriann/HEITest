package HEITest;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String addresse;
    private int poids;

    public Personne(String prenom, String addresse, LocalDate dateDeNaissance, String nom, int poids) {
        this.prenom = prenom;
        this.addresse = addresse;
        this.dateDeNaissance = dateDeNaissance;
        this.nom = nom;
        this.poids = poids;
    }

    public void voyager() {
        System.out.println("En train de voyager");
    };

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateDeNaissance.getYear();
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }
}
