package fr.diginamic.operations;

/**
 * @author BOURA Troulé
 *
 */
public class Operations {
	/**
	 * @param a
	 * @param b
	 * @param operation
	 */
	public static double calcul(double a, double b, char operation) {
		double resultat = 0;
		if (operation == '+') {
			resultat = a + b;
		} else if (operation == '-') {
			resultat = a - b;
		} else if (operation == '*') {
			resultat = a * b;
		} else if (operation == '/') {
			resultat = a / b;
		}
		return resultat;
	}

}
