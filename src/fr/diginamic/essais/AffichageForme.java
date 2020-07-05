package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author BOURA Troulé
 *
 */
public class AffichageForme {
	public void affichage(Cercle cercle) {
		System.out.println(+ cercle.calculeSurface());
		System.out.println(+ cercle.calculePerimetre());
	}
	
	public void affichage(Rectangle rectangle) {
		System.out.println(+ rectangle.calculeSurface());
		System.out.println(+ rectangle.calculePerimetre());
	}

}
