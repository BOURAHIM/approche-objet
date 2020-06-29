package fr.diginaminic.banque.entites;

public class Compte {
	private String numeroCompte;
	private double soldeCompte;
	
	/*
	 * Construteur numero et solde du compte
	 */
	public Compte(String numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	
	
	/*
	 * Red�finition de m�thode
	 * @return String
	 */
	//@override(ne marche pas)
	public String toString() {
		return "Le num�ro de compte est " + numeroCompte + " et le solde du compte est " + soldeCompte;
	}
	
	/*
	 * R�gles d'encapsulation
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
