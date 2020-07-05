package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author BOURA Troulé
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calcuMoyenne = new CalculMoyenne();
		calcuMoyenne.ajout(11);
		calcuMoyenne.ajout(22);
		calcuMoyenne.ajout(33);
		calcuMoyenne.ajout(44);
		
		double resultat = calcuMoyenne.calcul();
		System.out.println("La moyenne est " + calcuMoyenne);

	}

}
