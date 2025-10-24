package TD12025.Exo4;

// Exercice 4 : Système de Panier d’Achat avec Gestion des Stocks

// Créez une classe Produit avec des attributs pour le nom du produit, le prix et la quantité en stock.
// Créez une classe Panier qui permet d’ajouter des produits et de calculer le total. Si un utilisateur tente
// d’ajouter une quantité supérieure à la quantité en stock, le programme lève une QuantiteIndisponibleException

class QuantiteIndisponibleException extends Exception {
    public QuantiteIndisponibleException(String message) {
        super(message);
    }
}

public class Exo4 {
    public static void main(String[] args) throws QuantiteIndisponibleException {
        Produit produit1 = new Produit("Laptop", 999.99, 5);
        Panier panier = new Panier();
        panier.ajouterProduit(produit1, 3); // Ajout valide
        System.out.println("Total du panier: " + panier.calculerTotal());

    }
}
