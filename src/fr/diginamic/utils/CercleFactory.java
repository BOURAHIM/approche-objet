package fr.diginamic.utils;

import fr.diginamic.formes.Cercle;

/**
 * Cercle Factory
 * @author BOURA Troul�
 *
 */
public class CercleFactory {
	/**
	 * Retourne un cerlce
	 * @param rayon
	 * @return cercle
	 */
	public static Cercle creerCerlce(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}
}
