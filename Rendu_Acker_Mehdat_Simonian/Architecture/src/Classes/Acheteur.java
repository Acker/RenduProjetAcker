package Classes;

import java.util.ArrayList;
import java.util.HashMap;


public class Acheteur extends User{
	public static Catalogues a;
	private static int id_acheteur;
	//parametres correspondant à l'activation des differentes alertes
	private Boolean alerteEnchereDepassee,alerteFinAnnonce ;
	//liste de toutes les encheres d'un acheteur 
	private HashMap<Integer,Enchere> encheres = new HashMap<Integer,Enchere>(); 
	//on cree la liste d'enchere en meme temps que l'acheteur
	public Acheteur(String n, String p) {
		super(n, p);
		id_acheteur=id;
		HashMap<Integer,Enchere>encheres =new HashMap<Integer,Enchere>();
	}
	public Boolean enchere(int id,int prix) 
	{
		Enchere e = new Enchere(id,prix);	
		if (id_acheteur == Vendeur.getId_vendeur()) 
		{

			try {
				throw new IllegalAccessException("vous ne pouvez pas encherir sur votre propre enchere");
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		}
		else {
			Alerte_Enchere_Depassee alerte = new Alerte_Enchere_Depassee();

		}
		return true;	
	}
	public Boolean getAlerteEnchereDepassee() {
		return alerteEnchereDepassee;
	}
	public Boolean getAlerteFinAnnonce() {
		return alerteFinAnnonce;
	}
}

