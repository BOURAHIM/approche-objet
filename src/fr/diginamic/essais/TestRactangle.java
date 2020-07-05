package fr.diginamic.essais;

import fr.diginamic.formes.Rectangle;

public class TestRactangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(5.5, 4.5);
		System.out.println("Le périmetre est " + rectangle1.calculePerimetre());
		System.out.println("La surface est " + rectangle1.calculeSurface());

		Rectangle rectangle2 = new Rectangle(7.4, 3.2);
		System.out.println("Le périmetre est " + rectangle2.calculePerimetre());
		System.out.println("La surface est " + rectangle2.calculeSurface());

	}

}
