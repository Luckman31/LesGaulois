package personnages;

public class Village{ 
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois= new Gaulois[nbVillageoisMaximum];
	}
	private void ajouterHabitant(Gaulois habitant) {
		villageois[nbVillageois]=habitant;
		nbVillageois+=1;
	}	
	public Gaulois  trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0;i!=nbVillageois;i++) {
			System.out.println("-"+villageois[i].getNom());
		}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourix=new Chef("Abraracourix",6,village);
		Gaulois asterix=new Gaulois("Asterix",8);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix=new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.setChef(abraracourix);
		village.afficherVillageois();
	}
}
