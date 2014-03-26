package Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import Classes.User;
import org.junit.Before;
import org.junit.Test;



public class Test_User {

	//on vérifie que chaque user id est unique
	@Test
	public final void testCreationId() {

		User usr1= new User("dupont","patrick");
		User usr2= new User("dup","patrick");
		User usr3= new User("dup","patrick");
		System.out.println("utilisateur crée" +"id " + usr1.getId());
		System.out.println("utilisateur crée" +"id " + usr2.getId());
		System.out.println("utilisateur crée" +"id " + usr3.getId());
		assertThat(usr1.getId(), not(equalTo(usr2.getId())));
	}

	//les paramètres ne doivent pas être nuls
	@Test
	public final void testEchecCreationNomPrenom() {
		User usr5= new User("","");
		assertFalse("param invalides", usr5.getNom()=="" && usr5.getPrenom()=="");
	}

	@Test
	public final void testEchecCreationNom() {
		User usr6= new User("","aaaa");
		assertFalse("param invalides", usr6.getNom()=="");
	}

	@Test
	public final void testEchecCreationPrenom() {
		User usr7= new User("aaaa","");
		assertFalse("param invalides", usr7.getPrenom()=="");
	}

	@Test
	public final void testCreationReussiePrenomNom() {
		User usr8= new User("aaaa","aaaa");
		assertTrue("param invalides", usr8.getPrenom()!="" && usr8.getPrenom() !="");

	}






}
