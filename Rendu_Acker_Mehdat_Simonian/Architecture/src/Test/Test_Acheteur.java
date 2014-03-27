package Test;

import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.Test;


import Classes.Acheteur;
import Classes.Annonce;
import Classes.Enchere;
import Classes.Vendeur;

public class Test_Acheteur {


	//on verifie que deux acheteurs crées successivement n'ont pas le meme id
	@Test
	public void testCreation() {
		Acheteur a1 = new Acheteur("David", "Dupond");
		Acheteur a2 = new Acheteur("Robert", "Martin");
		assertFalse(a2.getId() ==a1.getId() )	;    		
	}

	//On verfie qu'on ne peut pas encherir sur une annonce qui n'existe pas
	@Test
	public void testEncherirAnnonceExistante() throws InstantiationException, ReflectiveOperationException {
		Acheteur ach = new Acheteur ("Patrix","son");
		Vendeur a= new Vendeur("dupont", "dupont");
		Annonce ano2 =a.CreationAnnonce("desc", 150, null);
		a.Publier(ano2.getId_Annonce());
		//System.out.println(Enchere.a.catalogue.get(0));
		ach.enchere(1000, 0);
		assertEquals(1000, ano2.getPrix());
	}

	@Test(expected= IllegalArgumentException.class) 
	public void testEncherirAnnonceNonPubliee() {
		Acheteur a1 = new Acheteur("David", "Dupond");
		Annonce ano = new Annonce ("test", 0, null,0);
		assertFalse(a1.enchere(ano.getId_Annonce(), 100));

	}
	@Test(expected= IllegalArgumentException.class)
	public void testEnchereBasse() throws Exception {
		Acheteur a1 = new Acheteur("David", "Dupond");
		Vendeur v= new Vendeur("dupont", "dupont");
		Annonce ano = v.CreationAnnoncePrixReserve("test", 200, null,0);
		v.Publier(ano.getId_Annonce());
		a1.enchere(10,ano.getId_Annonce());
	}

}
