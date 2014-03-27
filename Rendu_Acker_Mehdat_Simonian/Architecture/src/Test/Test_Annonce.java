package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import Classes.Annonce;

public class Test_Annonce {

	@Test
	public void testCreationIdDifferents() {
		Annonce ann1 = new Annonce("test", 0, null, 0);
		Annonce ann2 = new Annonce("test22", 0, null, 0);
		System.out.println(" l'id de l'annonce est " + ann1.getId_Annonce());
		System.out.println("l'id de l'annonce est " + ann2.getId_Annonce());
		assertNotSame(ann1.getId_Annonce(), ann2.getId_Annonce());
	}
	
	@Test 
	public void testPrixNegatif() {
		Annonce ann1 = new Annonce("test", -10, null, 0);
		System.out.println(" le prix de cette annonce est " + ann1.getPrix());
		assertEquals(0, ann1.getPrix(), 0);
	}



}
