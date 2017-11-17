public class Technicien extends Personne{
	private int techID;

	public Technicien(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 1);
	}
	
	public Technicien(String pseudo, String motDePasse, String nom, String prenom, int privilege, int techID) {
		super(pseudo, motDePasse, nom, prenom, privilege);
		this.techID = techID;
	}

	@Override
	public String toString() {
		return super.toString()+"techID=" + techID;
	}

	@Override
	public int connect(String pseudo, String motDePasse) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Voiture getVoiture(int voitID) {
		//besoin de la base de donnée
		return null;
	}
	
	public void setKilometrage(int voitID, long kilometrage) {
		//besoin de la base de donnée
	}
	
	public void setNote(int locationID, String note) {
		//besoin de la base de donnée
	}
	
	public void setAccompteStatut(int locationID, boolean estPaye) {
		//besoin de la base de donnée
		
	}
	
	public void createFacture(int locationID, boolean estPaye) {
		//besoin de la base de donnée
	}

}