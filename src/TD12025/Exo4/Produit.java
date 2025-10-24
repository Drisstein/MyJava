package TD12025.Exo4;

// Créez une classe Produit avec des attributs pour le nom du produit, le prix et la quantité en stock.
// Créez une classe Panier qui permet d’ajouter des produits et de calculer le total. Si un utilisateur tente d’ajouter une quantité supérieure à la quantité en stock, le programme lève une QuantiteIndisponibleException
public class Produit {
    Private String NomProduit;
    Private Double Prix;
    Private int Qstock;
    Private String[] Produits = {};

    public Produit(String NomProduit,Double Prix,
    int stock ) {
        this.NomProduit=NProd;
        this.Prix=Prix;
        this.Qstock=stock;
    }

    public void setNomProduit(String NomProduit) {
        this.NomProduit=NomProduit;
    }
    public String getNomProduit() {
        return this.NomProduit;
    }
    public void setPrix(Double Prix) {
        this.Prix=Prix;
    }
    public Double getPrix() {
        return this.Prix;
    }
    public void setQstock(int Qstock) {
        this.Qstock=Qstock;
    }
    public int getQstock() {
        return this.Qstock;
    }

    
}
