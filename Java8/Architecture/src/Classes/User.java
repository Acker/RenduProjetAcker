package Classes;
import java.util.logging.Logger;


public  class User {
	private int id;
	private String nom;
	private String prenom;
	private static int compteur=0;

	public User(String n, String p) {
		this.id=compteur;		
		//on verifie que les parametres ne sont pas nuls 
		if(n ==null || p ==null){
			throw new IllegalArgumentException("nom et prenom ne peuvent etre nuls");
		}

		this.nom=n;
		this.prenom=p;
		compteur ++;
	}



	public int getId() {

		return this.id;
	}
	public String getNom() {

		return this.nom;
	}
	public String getPrenom() {

		return this.prenom;
	}

}

