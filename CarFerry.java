package HEITest;

import java.util.ArrayList;

public class CarFerry extends Vehicule {
    private ArrayList vehiculeList = new ArrayList<>();

    public CarFerry(String immatriculation, Double kilometrage, int longueur, String modele, int poidsAVide, int carburant, int consommation) {
        super(immatriculation, kilometrage, longueur, modele, poidsAVide, carburant, consommation);
    }

    public void embarquer (Vehicule v){
        vehiculeList.add(v);
    }

    public void debarquer (Vehicule v){
        vehiculeList.remove(v);
    }

    public void chercherVoyageur (Personne p) {
        for (int i=0; i<vehiculeList.size(); i++){
            Vehicule vehicule = (Vehicule) vehiculeList.get(i);
            if (vehicule.getConducteur().equals(p)){
                System.out.println("Personne trouvee");
            }
            if (vehiculeList.get(i) instanceof Voiture){
                int nbPlace = ((Voiture) vehiculeList.get(i)).getNombreDePlace();
                for (int j=0; j<nbPlace; j++){
                    if (((Voiture) vehiculeList.get(i)).getPassager(j).equals(p)){
                        System.out.println("Personne trouvee");
                    }
                }
            }
        }
        System.out.println("Personne non trouvee");
    }
}
