package HEITest;

import java.util.Objects;

public abstract class Vehicule {
    private String modele;
    private String immatriculation;
    private Double kilometrage;
    private int poidsAVide;
    private int longueur;
    private int carburant;
    private Conducteur conducteur;
    private int consommation;

    public Vehicule(String immatriculation, Double kilometrage, int longueur, String modele, int poidsAVide, int carburant, int consommation) {
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.longueur = longueur;
        this.modele = modele;
        this.poidsAVide = poidsAVide;
        this.carburant = carburant;
        this.conducteur = null;
        this.consommation = consommation;
    }

    public void changerConducteur(Conducteur conducteur) {
        if (conducteur.getAge() >= 18) {
            this.conducteur = conducteur;
        } else {
            System.out.println("Trop jeune");
        }
    }

    public int getPoids() {
        return poidsAVide+carburant;
    }

    public int getPoids(int charge) {
        return poidsAVide+carburant+charge;
    }

    public void allerAlaPompe(int carburant) {
        carburant += carburant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return Objects.equals(immatriculation, vehicule.immatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(immatriculation);
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void rouler(int distanceEnKm) {
        boolean carburantInsuffisant = carburant < consommation*distanceEnKm;
        if (conducteur == null) {
            System.out.println("Pas de conducteur");
        } else if (carburantInsuffisant){
            System.out.println("Carburant insuffisant");
        } else if (conducteur == null && carburantInsuffisant) {
            System.out.println("Pas de conducteur et carburant insuffisant");
        } else {
            System.out.println("En train de rouler");
            carburant -= consommation*distanceEnKm;
            kilometrage += distanceEnKm;
        }


    }
}
