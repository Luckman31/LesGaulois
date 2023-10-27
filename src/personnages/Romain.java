package personnages;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements=new Equipement[2];
	int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePositive();
		
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert forcePositive();
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert this.force<force;
	}
	private boolean forcePositive() {
		boolean positif=true;
		if (force<0) {
			positif=false;
		}
		
		return positif;
	}
	public void sEquiper(Equipement nouvelEquipement) {
		switch(nbEquipement) {
		case 0:
			equipements[0]=nouvelEquipement;
			nbEquipement++;
			System.out.println("Le soldat "+nom+" s'équipe avec un "+nouvelEquipement+".");
			break;
		case 1:
			if (equipements[0]==nouvelEquipement) {
				System.out.println("Le soldat "+nom+" possède déjà un "+nouvelEquipement+"!");
				
			}else {
				equipements[1]=nouvelEquipement;
				nbEquipement++;
				System.out.println("Le soldat "+nom+" s'équipe avec un "+nouvelEquipement+".");
				
			}
			break;
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
		
		}
		
		
	}
	


	public static void main(String[] args) {
		Romain minus=new Romain("Minus",6);
		Equipement equipement1=Equipement.CASQUE;
		Equipement equipement2=Equipement.BOUCLIER;
		System.out.println("Bouclier : "+ equipement2);
		System.out.println("Casque : "+ equipement1);
		minus.sEquiper(equipement1);
		minus.sEquiper(equipement1);
		minus.sEquiper(equipement2);
		minus.sEquiper(equipement1);
		
	}
}