package metier;

import java.util.List;

import entity.Produit;

public interface ImetierCatalogue {
	public List<Produit> getProduitsParMotCle(String mc);
	public void addProduit(Produit p);
}
