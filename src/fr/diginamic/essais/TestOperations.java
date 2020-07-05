package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * @author BOURA Troulé
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		System.out.println(Operations.calcul(6, 3, '+'));
		System.out.println(Operations.calcul(6, 3, '-'));
		System.out.println(Operations.calcul(6, 3, '*'));
		System.out.println(Operations.calcul(6, 3, '/'));
	}

}
