package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import VENTE.Annonce;

//classe qui regroupe l'ensemble des annonces publiées
public  class Catalogues {
	public static HashMap<Integer,Annonce> catalogue; 
	
	//le constructeur cree juste la map qui regroupera l'ensemble des annonces c'est aux autres classes de les ajouter
	public Catalogues(){		
		catalogue =  new HashMap<Integer,Annonce>();
	}
	
	
	public HashMap<Integer, Annonce> getCatalogue() {
		return catalogue;
	}
	public String toString() {
		return "Annonce: [catalogue=" + catalogue + "]";
	}
}
