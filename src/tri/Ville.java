package tri;

public class Ville implements Comparable<Ville> {
	private String nom;
	private double nbHabitant;

	public Ville(String nom, double nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(double nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/*
	 * Méthodes compareTo les villes
	 */
	@Override
	public int compareTo(Ville o) {
		if(this.nbHabitant>o.getNbHabitant()) {
			return 1;
		}
		if(this.nbHabitant<o.getNbHabitant()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}
	

}
