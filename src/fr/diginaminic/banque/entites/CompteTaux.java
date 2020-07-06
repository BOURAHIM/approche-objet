package fr.diginaminic.banque.entites;

public class CompteTaux {
	String numeroCompte;
	int soldeCompte;
	double tauxRemune;
	
	/*
	 * Construteurs avec les 3 attributs
	 */
	public CompteTaux(String numeroCompte, int soldeCompte, double tauxRemune) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
		this.tauxRemune = tauxRemune;
	}
	
	

	/*
	 * Redéfinition de méthode
	 * @return String
	 */
	//@override(ne marche pas)
	public String toString() {
		super(numeroCompte, soldeCompte);
		return "Le numéro de compte est " + numeroCompte + " et le solde du compte est " + soldeCompte + "taux de rémunération" + tauxRemune;
	}

}
