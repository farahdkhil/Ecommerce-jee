package entity;

import java.io.Serializable;

public class Produit implements Serializable{
@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + ", image=" + image
				+ "]";
	}
private Long idProduit; 
private String nomProduit; 
private double prix;
private String image;
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Produit() {
super();
}
public Produit(String nomProduit, double prix) {
super();
this.nomProduit = nomProduit;
this.prix = prix;
}
public Long getIdProduit() {
return idProduit;
}
public void setIdProduit(Long idProduit) {
this.idProduit = idProduit;
}
public String getNomProduit() {
return nomProduit;
}
public void setNomProduit(String nomProduit) {
this.nomProduit = nomProduit;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
}
