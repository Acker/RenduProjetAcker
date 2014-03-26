package Classes;

import java.util.HashMap;

import VENTE.Annonce;

//un acheteur qui mise crée une instance d'enchere pour permettre d'avoir un historique de toute ses mises

public class Enchere {
	private int montant;
	private int id_annonce;

	public Enchere(int mise , int id_annonce){
		this.id_annonce=id_annonce;
		this.montant=montant;
		//verification si l'annonce existe
		if ( Catalogues.catalogue.containsKey(id_annonce) == false) {
			throw new IllegalArgumentException("vous essayez de miser sur une annonce qui n'existe pas");
		}
		else {
			//vérification que la mise est superieure au prix actuel
			if (Catalogues.catalogue.get(id_annonce).getPrix() > mise) {
				throw new IllegalArgumentException("la mise doit etre supperieure au prix actuel");		
			}
			else {
				System.out.print("enchere reussie");
			}
		}
	}
	public int getMontant() {
		return montant;
	}
}







