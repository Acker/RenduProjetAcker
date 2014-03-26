import VENTE.Annonce;
import VENTE.Vendeur;
import Classes.Acheteur;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Annonce a10 = new Annonce("ceci est une annonce de test", 0, null, 0)		;
Vendeur v = new Vendeur("a", "b");
Vendeur v2 = new Vendeur("a", "b");
Acheteur a1 = new Acheteur("a","b");
//System.out.print(v.getId());
//System.out.print("\n" + a1.getId());
System.out.println(a10.toString());
	}

}
