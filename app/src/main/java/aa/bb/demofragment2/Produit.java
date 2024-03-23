package aa.bb.demofragment2;

import java.util.ArrayList;
import java.util.Arrays;


public class Produit {
    private  String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return  nom ;
    }

    public static ArrayList<Produit> getLstProduit()
    {
//Remplir la collection de produits à partir de la source de données
        //La source de données : bases de données, api, fichiers....
        return new ArrayList<Produit>(
                Arrays.asList(
                        new Produit("Stylo", 20.0),
                        new Produit("Gomme", 10.7),
                        new Produit("Crayon", 5.6),
                        new Produit("Règle", 8.0)
                ));




   }


}
