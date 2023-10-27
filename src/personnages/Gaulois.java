package personnages;

import java.security.PublicKey;



public class Gaulois {
	private String nom;

	private int force; 
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}



//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
//				+ romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}
//	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		return;
	}

//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force
//				+ ", effetPotion=" + effetPotion + "]";
//	}
	public static void main(String[] args) {
		

		//TODO créer un main permettant de tester la classe Gaulois
	}
private void asterix(String string, int i) {
	// TODO Auto-generated method stub
	
}
}




