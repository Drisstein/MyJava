package Correction;

public class Produit {
    private String NomProduit;
    private int Qstock;
    private Double Prix;

    public Produit(String NomProduit,Double Prix,
    int Qstock ) {
        this.NomProduit=NomProduit;
        this.Prix=Prix;
        this.Qstock=Qstock;
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