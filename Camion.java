package HEITest;

public class Camion extends Vehicule {
    private Colis colis;

    public Camion(String immatriculation, Double kilometrage, int longueur, String modele, int poidsAVide, int carburant, int consommation) {
        super(immatriculation, kilometrage, longueur, modele, poidsAVide, carburant, consommation);
        this.colis = null;
    }

    public void ajouterColis (Colis colis) {
        this.colis = colis;
    }

    public void retirerColis () {
        this.colis = null;
    }
}
