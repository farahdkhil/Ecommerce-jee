package dao;

import java.util.List;

import entity.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod= pdao.getProduit(2L);
		//c'est grace à la méthode toString qu'il affiche les valeurs
		System.out.println(prod);
		prod.setNomProduit("pc Hp");
		pdao.updateProduit(prod);
		System.out.println("And this is the product after update " +prod);
	}
}
