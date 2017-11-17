
public class Facture {
	private int factID;
	private double montant;
	private int locationID;
	private int techID;
	private boolean estPaye;
	
	public int getFactID() {
		return factID;
	}
	public void setFactID(int factID) {
		this.factID = factID;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public int getTechID() {
		return techID;
	}
	public void setTechID(int techID) {
		this.techID = techID;
	}
	public boolean isEstPaye() {
		return estPaye;
	}
	public void setEstPaye(boolean estPaye) {
		this.estPaye = estPaye;
	}
	public Facture(int locationID, int techID, boolean estPaye) {
		this.montant = this.CalculMontant();
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	public Facture(int factID, int locationID, int techID, boolean estPaye) {
		this.factID = factID;
		this.montant = this.CalculMontant();
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	@Override
	public String toString() {
		return "factID=" + factID + ", montant=" + montant + ", locationID=" + locationID + ", techID="
				+ techID + ", estPaye=" + estPaye;
	}
	
	public double CalculMontant() {
		Location tempLocation = this.getLocation();
		Assurance tempAssur = getAssurance(tempLocation.getAssurID());
		Voiture tempVoit = getVoiture(tempLocation.getVoitureID());
		return (tempAssur.getPrix() + tempVoit.getPrix());
	}
	
	public Location getLocation() {
		// recherche dans la BDD avec this.locationID
		Location loca = new Location(0, 1, 2, 3, 4, false);
		return loca;
	}
	public Voiture getVoiture(int voitID) {
		// recherche dans la BDD
		Voiture voit=new Voiture(500.0, "Opel", "Corsa", 2010, "citadine","Diesel", "noir", true, 2, 99000, 100.0, 130.0, 900.0, 0 );
		return voit;
	}
	public Assurance getAssurance(int assurID) {
		// recherche dans la BDD
		Assurance assur= new Assurance(0, 300.0, "OMNIUM", 1.2);
		return assur;
	}
}
