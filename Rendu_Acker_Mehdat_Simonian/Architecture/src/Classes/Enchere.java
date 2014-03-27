package Classes;

import java.util.HashMap;


//un acheteur qui mise crée une instance d'enchere pour permettre d'avoir un historique de toute ses mises

public class Enchere {

	public static Catalogues a;
	private int montant;
	private Integer id_annonce;

	public Enchere(int mise , int id_annonce){
		this.id_annonce=id_annonce;
		this.montant=mise;
		//verification si l'annonce existe
		if ( a.catalogue.containsKey(id_annonce) == false) {
			throw new IllegalArgumentException("vous essayez de miser sur une annonce qui n'existe pas");
		}
		else {
			//vérification que la mise est superieure au prix actuel
			if (a.catalogue.get(id_annonce).getPrix() > mise) {
				throw new IllegalArgumentException("la mise doit etre supperieure au prix actuel");		
			}
			else {
				System.out.print("enchere reussie pour l'annonce" + a.catalogue.get(id_annonce).toString());
				a.catalogue.get(id_annonce).setPrix(mise);
				AlerteOffre alof = new AlerteOffre();
			}
		}
	}
	public int getMontant() {
		return montant;
	}
}







