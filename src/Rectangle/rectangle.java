package Rectangle;

import java.util.Scanner;

public class rectangle {
    Scanner sc = new Scanner(System.in);
    double longueur, largeur;

    // Constructeur par défaut
    public rectangle() {
    }

    // Constructeurs
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthodes
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double surface() {
        return longueur * largeur;
    }

    public void afficher() {
        System.out.println("Le perimetre du rect est : " + perimetre());
        System.out.println("La surface du rect est : " + surface());
    }

    public void demander() {
        System.out.print("Saisir Long: ");
        longueur = sc.nextDouble();

        System.out.print("Saisir Larg: ");
        largeur = sc.nextDouble();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            rectangle rect = new rectangle();
            rect.demander();
            rect.afficher();
        }
    }
}
