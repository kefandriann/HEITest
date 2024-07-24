package HEITest;

import java.time.LocalDate;

public class Voyageur extends Personne {
    private LocalDate dateDeVoyage;

    public Voyageur(String prenom, String addresse, LocalDate dateDeNaissance, String nom, int poids, LocalDate dateDeVoyage) {
        super(prenom, addresse, dateDeNaissance, nom, poids);
        this.dateDeVoyage = dateDeVoyage;
    }

    public LocalDate getDateDeVoyage() {
        return dateDeVoyage;
    }

    public void setDateDeVoyage(LocalDate dateDeVoyage) {
        this.dateDeVoyage = dateDeVoyage;
    }
}
