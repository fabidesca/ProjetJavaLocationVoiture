import java.time.LocalDate;
/**
 * 
 * @author fabia
 * Cette classe repr�sente un client avec ses informations personnelles 
 */
public class Client extends Personne {
	private int clientID;
	private LocalDate dateInscription;
	private LocalDate dateNaissance;
	private String adresse;
	private String adresseMail;
	/**
	 * C'est le constructeur utilis� pour cr�er le client
	 * @param pseudo Le pseudo du client
	 * @param motDePasse le mot de passe du client
	 * @param nom le nom du client
	 * @param prenom le pr�nom du client
	 * @param dateInscription la date � laquelle le client s'est inscrit
	 * @param dateNaissance la date de naissance du client
	 * @param adresse l'adresse o� habite le client
	 * @param adresseMail l'adresse mail du client
	 */
	
	public Client(String pseudo, String motDePasse, String nom, String prenom,
			LocalDate dateInscription, LocalDate dateNaissance, String adresse, String adresseMail) {
		super(pseudo, motDePasse, nom, prenom, 2);
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.adresseMail = adresseMail;
	}
	/**
	 * Obtiens l'ID du client
	 * @return clientID ID  � donner au client
	 */
	public int getClientID() {
		return clientID;
	}
	/**
	 * Mets en place un ID au client
	 * @param clientID l'ID du client
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	/**
	 * Obtiens la date d'inscription du client
	 * @return dateInscription la date d'inscription � donner au client
	 */
	
	public LocalDate getDateInscription() {
		return dateInscription;
	}
	/**
	 * Mets en place la date d'inscription du client
	 * @param La date d'inscription du client
	 */
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}
	/**
	 * Obtiens la date de naissance du client
	 * @return la date de naissance � donner au client
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 *  Mets en place la date de naissance du client
	 * @param dateNaissance la date de naissance du client
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * Obtiens l'adresse du client
	 * @return  l'adresse � donner au client
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * Mets en place l'adresse du client
	 * @param adresse l'adresse du cleitn
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Obtiens l'adresse email du client
	 * @return l'adresse email � donner au client
	 */
	public String getAdresseMail() {
		return adresseMail;
	}
	/**
	 * Mets en place l'adresse email du client
	 * @param adresseMail l'adresse mail du client
	 */
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	/**
	 * Cette m�thode donne une repr�sentation textuelle du client
	 */
	@Override
	public String toString() {
		return super.toString()+ "clientID=" + clientID + ", dateInscription=" + dateInscription + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", adresseMail=" + adresseMail;
	}
	/**
	 * Cette m�thode n�cessite d'avoir acc�s � la bande de donn�es.
	 */
	@Override
	public int connect(String pseudo, String motDePasse) {
		// Connexion � la base de donn�es
		return 0;
	}
	/**
	 * Cette m�thode donnera la liste des voitures qui ne sont pas encore lou�es
	 * @return Elle retournera la liste des voitures non lou�es
	 */
	public Voiture[] getListVoitureDisp() {
		// Besoin de la base de donn�es
		return null;
	}
	/**
	 * Cette m�thode donnera la liste des voitures d�j� lou�es
	 * @return Elle retournera la liste des voitures d�j� lou�es
	 */
	public Voiture[] getListVoitureLouees() {
		// Besoin de la base de donn�es
		return null;
	}
	/**
	 * Cette m�thode donnera la location de chaque voiture par leur ID
	 * @param voitID l'ID de chaque voiture
	 * @return Retournera l'ID de chaque voiture
	 */
	public int getLocationID(int voitID) {
		// Besoin de la base de donn�es
		return 0;
	}
	/**
	 * Cette m�thode donnera le tarif de chaque voiture. 
	 * @param voiture la voiture
	 * @param assurance L'assurance du client 
	 * @return Retournera le tarif final � payer
	 */
	public double getTarif(Voiture voiture, Assurance assurance) {
		// Besoin de la base de donn�es
		return 0.0;
	}
	/**
	 * Cette m�thode donne une liste des assurances
	 * @return Retournera la liste des assurances
	 */
	public Assurance[] getAssurance() {
		// Besoin de la base de donn�es
		return null;
	}
	/**
	 * Cette m�thode sert � valider la location pour qu'une location soit confirmer 
	 * @param voitID L'ID de la voiture
	 * @param assurID L'ID de l'assurance
	 * @return Retournera la validation de la location
	 */
	public int valideLocation(int voitID, int assurID) {
		// Besoin de la base de donn�es
		return 0;
	}
}
