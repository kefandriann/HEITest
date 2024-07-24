package HEITest;

import java.time.LocalDate;

public class Conducteur extends Voyageur{
    private int numeroDePermis;

    public Conducteur(String prenom, String addresse, LocalDate dateDeNaissance, String nom, int poids, LocalDate dateDeVoyage, int numeroDePermis) {
        super(prenom, addresse, dateDeNaissance, nom, poids, dateDeVoyage);
        this.numeroDePermis = numeroDePermis;
    }

    public int getNumeroDePermis() {
        return numeroDePermis;
    }

    public void setNumeroDePermis(int numeroDePermis) {
        this.numeroDePermis = numeroDePermis;
    }
}
