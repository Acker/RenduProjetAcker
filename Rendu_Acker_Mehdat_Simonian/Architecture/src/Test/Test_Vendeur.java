package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Acheteur;
import Classes.Annonce;
import Classes.Enchere;
import Classes.User;
import Classes.Vendeur;

public class Test_Vendeur {

	//verification creation et publication annonce
	@Test
	public void CreationAnnonce() throws Exception  {
		Vendeur a= new Vendeur("dupont", "dupont");
		Annonce ano1 =a.CreationAnnonce("desc", 150, null);
		Annonce ano2 =a.CreationAnnonce("desc", 150, null);
		a.Publier(ano2.getId_Annonce());
		//System.out.print(ano2.getId_Annonce());
		assertEquals(ano2.getEtatAnnonce(), 1);
		System.out.println(Enchere.a.catalogue.containsKey(1));
		System.out.println(Enchere.a.catalogue.toString());
		System.out.println(Enchere.a.catalogue.get(1));
	}
	//on teste la suppression dans le cas ou le prix de reserve n'a pas ete atteint
	@Test(expected= IllegalArgumentException.class)
	public void testAnnulationAnnonce() throws Exception{
		Vendeur v= new Vendeur("dupont", "dupont");
		Annonce ano = v.CreationAnnoncePrixReserve("test", 200, null,0);
		v.Publier(ano.getId_Annonce());
		v.Supprimer(ano.getId_Annonce());
		assertEquals(null,Vendeur.a.catalogue.get(ano.getId_Annonce()));
	}

	@Test(expected= IllegalArgumentException.class)
	public void testAnnulationImpossible() throws Exception{
		Vendeur v2= new Vendeur("dupont", "dupont");
		Acheteur a1 = new Acheteur("David", "Dupond");
		Annonce ano = v2.CreationAnnoncePrixReserve("test", 200, null,20);
		v2.Publier(ano.getId_Annonce());
		a1.enchere(100,ano.getId_Annonce());
		v2.Supprimer(ano.getId_Annonce());
	}
}