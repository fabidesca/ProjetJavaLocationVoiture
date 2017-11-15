
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
	public Facture(double montant, int locationID, int techID, boolean estPaye) {
		this.montant = montant;
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	public Facture(int factID, double montant, int locationID, int techID, boolean estPaye) {
		this.factID = factID;
		this.montant = montant;
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	@Override
	public String toString() {
		return "factID=" + factID + ", montant=" + montant + ", locationID=" + locationID + ", techID="
				+ techID + ", estPaye=" + estPaye;
	}
	
	
}
