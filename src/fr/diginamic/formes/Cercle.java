package fr.diginamic.formes;

/**
 * @author BOURA Troulé
 *
 */
public class Cercle {
	private double rayon = 0;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * @return surface Cercle
	 */
	public double calculeSurface() {
		double surfaceCercle = ((this.rayon * this.rayon) * 3.14);
		return surfaceCercle;
	}

	/**
	 * @return perimetre
	 */
	public double calculePerimetre() {
		double perimetre = (3.14 * 2 * this.rayon);
		return perimetre;
	}
}
