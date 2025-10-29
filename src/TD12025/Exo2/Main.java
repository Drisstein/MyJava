package TD12025.Exo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NombreDePlacesInsuffisantException {
        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation();
        System.out.print("Entrez le nom du client : ");
        String nomClient = sc.nextLine();
        System.out.println("Entrer la date ");
        System.out.print("Entrez le nombre de places à réserver : ");
        int NbPlaceDemand = sc.nextInt();
        int NbPlaceDispo = 100;
        reservation.reserver(nomClient, NbPlaceDemand, NbPlaceDispo);
        sc.close();
    }
}
