package fr.diginamic.operations;

/**
 * @author BOURA Troulé
 *
 */
public class CalculMoyenne {
	private double[] tab;

	/**
	 * Constructeur calcule moyenne
	 */
	public CalculMoyenne() {
		this.tab = new double[0];
	}

	public void ajout(double ajoutTab) {

		double[] newTab = new double[tab.length];
		for (int i = 0; i < tab.length; i++) {
			newTab[i] = tab[i];
		}
	}

	public double calcul() {
		double laSomme = 0;

		for (int i = 0; i < this.tab.length; i++) {
			laSomme = laSomme + this.tab[i];
		}
		return (laSomme);
	}

	/**
	 * Getter
	 * 
	 * @return tab
	 */
	public double[] getTab() {
		return tab;
	}

	/**
	 * Setter
	 * 
	 * @param tab
	 */
	public void setTab(double[] tab) {
		this.tab = tab;
	}

}