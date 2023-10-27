package personnages;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements=new Equipement[2];
	int nbEquipement=0;
	private String texte;
	
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
//	public void recevoirCoup(int forceCoup) {
//		assert forcePositive();
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert this.force<force;
//	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
	// if (force > 0) {
		// parler("Aïe");
	// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
	// }
		if (force==0) {
			parler("Aïe");
		}
		else {
		
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			
		}
		
			// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
			
		
		
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
		default:
			System.out.println("erreur");
			break;
		}
		
			
		
		
	}
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
			
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			
			}
		}
		return equipementEjecte;
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