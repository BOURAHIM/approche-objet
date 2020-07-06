package fr.diginamic.salaire;

/**
 * @author BOURA Troulé
 *
 */
public abstract class Intervenant {
	protected String nom;
	protected String prenom;
	protected String salarier;
	

/** Constructeur
 * @param nom
 * @param prenom
 */
public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


public abstract double getSalaire();

public abstract String getStatut();

public void afficherDonnes() {
	System.out.println(nom + " " + prenom + " " + this.getSalaire()+ " Statut: "+ this.getStatut());

}
}