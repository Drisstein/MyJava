package Revision.bank;

import java.util.Scanner;

public class Bank {
    private double solde = 1000;
    double soldeInitial = solde; // garder le solde avant tentative de retrait
    private String nomTitulaire;
    private String numeroCompte;
    private double montantDepot;
    private double montantRetrait;
    static Scanner sc = new Scanner(System.in);

    // Constructeur par défaut
    public Bank() {
        System.out.println("Vous avez "+solde+" dans votre compte!");
    }   

    public Bank(double solde, String nomTitulaire, String numeroCompte) {
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void deposer() {
        System.out.print("Entrer le Montant à déposer: ");
        double montantDepot = sc.nextDouble();
        solde += montantDepot;
        System.out.println("Votre depot de " + montantDepot + " est réussi ! ");
    }

    public void retirer() {
        System.out.print("Entrer le Montant à retirer: ");
        double montantRetrait = sc.nextDouble();

        if (solde < montantRetrait) {
            System.out.println("Solde insuffisant pour effectuer le retrait !");
            System.out.println("Solde actuel: " + soldeInitial + " Frs");
        } else {
            solde -= montantRetrait;
            System.out.println("Le retrait de " + montantRetrait + " Frs est réussi !");
            System.out.println("Nouveau solde: " + solde + " Frs");
        }

    }

    public void demander() {
        System.out.print("Saisir le nom du titulaire: ");
        nomTitulaire = sc.nextLine();

        System.out.print("Saisir le numéro du compte: ");
        numeroCompte = sc.nextLine();
    }

    public void afficher() {
        System.out.println("");
        System.out.println("--INFOS COMTE--");
        System.out.println("Nom du titulaire: " + nomTitulaire);
        System.out.println("Numéro du compte: " + numeroCompte);
        System.out.println("Solde du compte: " + solde);
    }

    public static void main(String[] args) {
        while (true) {
            Bank compte1 = new Bank();
            compte1.demander();
            System.out.print("Voulez faire un dépôt (y/n)?");
            boolean choix = true;
            choix = sc.nextBoolean();
            if (!choix) {
                compte1.retirer();
            } else {
                compte1.deposer();
            }
            compte1.afficher();

        }

    }

}
