package fr.diginamic.entites;

/**
 * @author BOURA Troulé
 *
 */
public class Rectangle {
private double longueur = 0;
private double largueur = 0;
public Rectangle(double longueur, double largueur) {
	this.longueur = longueur;
	this.largueur = largueur;
}

/**
 * @return calcule Périmetre
 */
public double calculePerimetre() {
	double calculePerimetre = (this.largueur + this.longueur *2);
	return calculePerimetre;
}

public double calculeSurface() {
	double calculeSurface = (this.largueur * this.longueur);
	return calculeSurface;
}

}
