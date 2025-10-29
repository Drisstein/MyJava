package TD12025.Exo2;

// Exercice 2 : Système de Gestion de Réservations avec Exceptions Personnalisées
// Créez une classe Reservation avec des attributs pour le nom du client, la date et le nombre de places demandées.
// Créez une exception NombreDePlacesInsuffisantException qui est levée lorsque le nombre de places demandées dépasse le nombre de places disponibles.
// Dans la classe principale, implémentez un système qui permet aux utilisateurs de réserver des places
// pour un événement, en vérifiant à chaque réservation que les places restantes suffisent

class NombreDePlacesInsuffisantException extends Exception {
    public NombreDePlacesInsuffisantException(String message) {
        super(message);
    }
}
public class Reservation {
    String nomClient, date;
     int NbPlaceDemand;
     int NbPlaceDispo = 100;

    public void reserver(String nomClient, int NbPlaceDemand, int NbPlaceDispo)
            throws NombreDePlacesInsuffisantException {
        if (NbPlaceDemand > 100) {
            throw new NombreDePlacesInsuffisantException("Nombre de places insuffisant pour la réservation demandée.");
        } else {
            System.out.println(
                    "Réservation réussie pour " + nomClient + " le " + date + " pour " + NbPlaceDemand + " places.");
            NbPlaceDispo -= NbPlaceDemand;
            System.out.println("Nombre de places restantes : " + NbPlaceDispo);

        }
    }
}