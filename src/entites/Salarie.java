package entites;

/**
 * @author BOURA Troulé
 *
 */
public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return nom.toUpperCase() + " : " + prenom + " : " + salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}