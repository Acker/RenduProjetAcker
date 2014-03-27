package Classes;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;


public class Vendeur extends User {
	private  Boolean alertePrixReserveAtteint,alerteFinAnnonce ;
	private HashMap<Integer,Annonce> annonces ; 
	private static int id_vendeur;
	public static Catalogues a ;

	public Vendeur(String n, String p) {
		super(n, p);
		id_vendeur= id ;
		annonces = new HashMap<Integer,Annonce>();
	}
	//on cree une annonce sans prix de reserve etat en creation c'est à dire 0 
	public Annonce CreationAnnonce(String desc,int prix, Date date) {
		Annonce annonce = new Annonce(desc, prix, date,0);
		annonces.put(annonce.getId_Annonce(), annonce);
		return annonce;
	}
	//on cree une annonce avec en plus un prix de reserve
	public Annonce CreationAnnoncePrixReserve(String desc,int prix, Date date,int prixreserve ) {
		Annonce annonce = new Annonce(desc, prix,date,prixreserve);
		annonces.put(annonce.getId_Annonce(), annonce);	
		return annonce;
	}
	//on publie l'annonce l etat passe de 0 à 1
	public void Publier(int id_annonce) throws InstantiationException, IllegalAccessException {
		Annonce ar =annonces.get(id_annonce);
		ar.setEtatAnnonce(1);
		//on ajoute l'annonce au catalogue
		Catalogues.class.newInstance().catalogue.put(ar.getId_Annonce(),ar);
	}
	//on supprime l'annonce on enleve donc toutes les valeurs correspondant à son id
	public void Supprimer(int id_Annonce ) {
		Annonce ar = annonces.get(id_Annonce);
		int prixr =	ar.getPrixReserve();
		//La suppression n'est pas permise si le prix de reserve est depasse
		if(ar.getPrix() > prixr)
		{
			throw new IllegalArgumentException("votre prix de reserve a ete depasse vous ne pouvez plus annuler votre enchere");

		}
		else {
			annonces.remove(id_Annonce);
			a.catalogue.remove(id_Annonce);
			System.out.println("votre annonce a bien ete supprimee");
		}
	}

	public static int getId_vendeur() {
		return id_vendeur;
	}
	private void ModifPrix(int prix, int id_annonce) {
	}
	public Boolean getAlertePrixReserveAtteint() {
		return alertePrixReserveAtteint;
	}
	public Boolean getAlerteFinAnnonce() {
		return alerteFinAnnonce;
	}
}
