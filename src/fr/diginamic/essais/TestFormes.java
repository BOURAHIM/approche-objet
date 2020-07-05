package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestFormes {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(4);
		Rectangle rectangle = new Rectangle(6, 8);

		AffichageForme affichage = new AffichageForme();
		affichage.affichage(cercle);
		affichage.affichage(rectangle);

	}

}
