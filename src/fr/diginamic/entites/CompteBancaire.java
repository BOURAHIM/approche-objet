package fr.diginamic.entites;

/**
 * @author BOURA Troulé
 *
 */
public class CompteBancaire {
	private String numCompte;
	private double soldeCompte = 3.4;
	private String proprietaire;

	public CompteBancaire(String numCompte, double soldeCompte, String proprietaire) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
		this.proprietaire = proprietaire;
	}

	@Override
	public String toString() {
		return "CompteBancaire (numCompte=" + numCompte + ", " + " proprietaire=" + proprietaire + ")";
	}

	/**
	 * @return créditer un montant sur le compte
	 */
	public double crediterMontant() {
		double crediterMontant = 45.4;
		return crediterMontant;
	}

	/**
	 * @return débiter un montant sur le compte
	 */
	public double debiterMontant() {
		double debiterMontant = 34.6;
		return debiterMontant;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

}
