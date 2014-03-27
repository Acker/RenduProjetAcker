package Classes;

import java.util.Date;
import java.util.List;

public class Annonce {
	private int Id_Annonce;
	private String Description;
	private int prix;
	private Date DateLimite;
	private int EtatAnnonce;
	private int IdVendeur;
	private int PrixReserve;
	private static int compteur;

	//constructeur pour annonce sans prix de reserve 
	public Annonce(String desc,int prix,Date date,int idvendeur) {
		this.Id_Annonce=compteur ;
		this.Description=desc;
		this.prix = prix;
		if (prix <0){
			this.prix=0;
		}
		this.DateLimite =date;
		this.EtatAnnonce =0;
		this.IdVendeur=idvendeur;
		compteur++;
	}
	public int getEtatAnnonce() {
		return EtatAnnonce;
	}

	//constructeur avec prix de reserve
	public Annonce(String desc,int prix,Date date,int idvendeur,int prixr) {
		this.Id_Annonce=compteur;
		this.Description=desc;
		this.prix = prix;
		this.DateLimite =date;
		this.EtatAnnonce =0;
		this.IdVendeur=idvendeur;
		this.PrixReserve = prixr;	
		compteur++;
	}	

	//sert à modifier le prix
	public void setPrix(int prix) {
		this.prix = prix;
	}
	//permet de récupérer l'id de l'annonce pour l'identifier
	public  int getId_Annonce() {
		return Id_Annonce;
	}
	public int getPrix() {
		return prix;
	}
	public String getDesc() {
		return this.Description;
	}

	public Date getDateLimite() {
		return this.DateLimite;
	}

	protected void setEtatAnnonce(int etatAnnonce) {
		EtatAnnonce = etatAnnonce;
	}
	protected int getPrixReserve() {
		return this.PrixReserve;
	}
	public String toString() {
		String retour = ("Annonce numero :" + Id_Annonce + " \ndescription :" + Description + "\nprix : "+ prix + "\tLa date limite est " + DateLimite );
		return retour;
	}
}
