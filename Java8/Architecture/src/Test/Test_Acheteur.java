package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Acheteur;

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
	public void testEncherirAnnonceExistante() {
		Acheteur a1 = new Acheteur("David", "Dupond");
		Acheteur a2 = new Acheteur("Robert", "Martin");	
		a1.enchere(5, 10);
	
	}
	
	
	
	
	
	
	
	
}
