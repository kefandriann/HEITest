package HEITest;

public class Voiture extends Vehicule {
    private int nombreDePlace;
    private Personne[] passagers = new Personne[nombreDePlace];

    public Voiture(String immatriculation, Double kilometrage, int longueur, String modele, int poidsAVide, int carburant, int consommation, int nombreDePlace) {
        super(immatriculation, kilometrage, longueur, modele, poidsAVide, carburant, consommation);
        this.nombreDePlace = nombreDePlace;
    }

    public void monter (Personne p) {

        for (int i=0; i<=nombreDePlace; i++){
            if (i<nombreDePlace){
                if (passagers[i] != null) {

                } else if (passagers[i] == null) {
                    passagers[i] = p;
                }
            }
            if (i==nombreDePlace){
                System.out.println("plus de place disponible");
            }
        }
    }

    public void descendre (Personne p) {
        for (int i=0; i<nombreDePlace; i++){
            if (passagers[i].equals(p)){
                passagers[i] = null;
            } else {
                System.out.println("Personne introuvable");
            }
        }
    }

    public Personne getPassager(int index) {
        return passagers[index];
    }

    public int getNombreDePlace() {
        return nombreDePlace;
    }
}
