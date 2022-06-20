package metier;

import java.util.List;

import entity.Produit;

public class TestMetier {
public static void main(String[] args) { 
	MetierImpl metier= new MetierImpl();
	List<Produit> prods = metier.getProduitsParMotCle("H");
	
	for (Produit p : prods) 
		System.out.println(p.getNomProduit());
}
}

