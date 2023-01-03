package brief_base_poo;

import java.util.ArrayList;

public class Bibliotheque {
	public ArrayList<Livre> listeLivres = new ArrayList<>();
	
	// Ajouter un livre à la liste Bibliotheque:
	public void ajouterLivre(Livre livre) {
		listeLivres.add(livre);
	}
	
	// Voir les livres de la bibliotèque (appelle la méthode d'affichage de Livre):
	public void voirLivres() {
		System.out.println("=== Livres de la bibliothèque ===");
		for (Livre livre : listeLivres) {
			livre.seeInfos();
			System.out.println("---------------------------------");
		}
	}
	
}
