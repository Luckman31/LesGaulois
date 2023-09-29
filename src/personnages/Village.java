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
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
	}
}
