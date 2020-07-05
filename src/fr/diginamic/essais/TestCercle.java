package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		/*
		 * Instanciez 2 cercles différents et affichez les résultats des méthodes de
		 * calcul de périmètre et de calcul de surface Cercle
		 */
		Cercle cercle1 = new Cercle(2.9);
		System.out.println("surface du cercle 1 est " + cercle1.calculeSurface());
		System.out.println("Perimetre du cercle 1 est " + cercle1.calculePerimetre());

		Cercle cercle2 = new Cercle(3.2);
		System.out.println("surface du cercle 2 est " + cercle2.calculeSurface());
		System.out.println("Perimetre du cercle 2 est " + cercle2.calculePerimetre());
		
		Cercle cercle3 = CercleFactory.creerCerlce(6.3);
		System.out.println("surface du cercle 3 est " + cercle3.calculeSurface());
		System.out.println("Perimetre du cercle 3 est " + cercle3.calculePerimetre());
	}

}