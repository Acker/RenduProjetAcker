package Classes;

import java.util.ArrayList;
import java.util.HashMap;

import VENTE.Annonce;

public class Acheteur extends User{
	//parametres correspondant à l'activation des differentes alertes
	private Boolean alerteEnchereDepassee,alerteFinAnnonce ;
	//liste de toutes les encheres d'un acheteur 
	private HashMap<Integer,Enchere> encheres = new HashMap<Integer,Enchere>(); 
	//on cree la liste d'enchere en meme temps que l'acheteur
	public Acheteur(String n, String p) {
		super(n, p);
		HashMap<Integer,Enchere>encheres =new HashMap<Integer,Enchere>();
	}
	public void enchere(int id,int prix) {
		Enchere e = new Enchere(id,prix);	
		
		
		
		
		}	
	public Boolean getAlerteEnchereDepassee() {
		return alerteEnchereDepassee;
	}
	public Boolean getAlerteFinAnnonce() {
		return alerteFinAnnonce;
	}
}

