package VENTE;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;

import Classes.Catalogues;
import Classes.User;

public class Vendeur extends User {
	private  Boolean alertePrixReserveAtteint,alerteFinAnnonce ;
	private HashMap<Integer,Annonce> annonces ; 

	public Vendeur(String n, String p) {
		super(n, p);
		annonces = new HashMap<Integer,Annonce>();
	}
	//on cree une annonce sans prix de reserve etat en creation c'est à dire 0 
	public void CreationAnnonce(String desc,int prix, Date date) {
		Annonce annonce = new Annonce(desc, prix, date,0);
		annonces.put(annonce.getId_Annonce(), annonce);
	}
	//on cree une annonce avec en plus un prix de reserve
	public void CreationAnnoncePrixReserve(String desc,int prix, Date date,int f ) {
		Annonce annonce = new Annonce(desc, prix,date,f);
		annonces.put(annonce.getId_Annonce(), annonce);	
	}
	//on publie l'annonce l etat passe de 0 à 1
	public void Publier(int position) {
		Annonce ar =annonces.get(position);
		ar.setEtatAnnonce(1);
//on ajoute l'annonce au catalogue
		Catalogues.catalogue.put(ar.getId_Annonce(), ar);
	}
	//on supprime l'annonce on enleve donc toutes les valeurs correspondant à son id
	private void Supprimer(int id_Annonce ) {
		Annonce ar = annonces.get(id_Annonce);
		int prixr =	ar.getPrixReserve();
		//La suppression n'est pas permise si le prix de reserve est depasse
		if(ar.getPrix() > prixr)
		{
			System.out.printf("votre prix de reserve a ete depasse vous ne pouvez plus annuler votre enchere");
		}
		annonces.remove(id_Annonce);
		Catalogues.catalogue.remove(id_Annonce);
		System.out.println("votre annonce a bien ete supprimee");
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
