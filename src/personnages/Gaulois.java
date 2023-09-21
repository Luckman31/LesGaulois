package personnages;

import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Gaulois {
	private String nom;
	private int force;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force
//				+ ", effetPotion=" + effetPotion + "]";
//	}
	public static void main(String[] args) {
		asterix (nom = "Ast�rix", force = 8);
		System.out.println(asterix);

		//TODO cr�er un main permettant de tester la classe Gaulois
	}
}




