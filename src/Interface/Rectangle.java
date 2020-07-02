package Interface;

public class Rectangle implements objetGeometrique {

	/** retourne le périmetre
	 *
	 */
	@Override
	public double perimetre() {
		return ((longueur * largeur)*2);
	}

	/** retourne la surface
	 *
	 */
	@Override
	public double surface() {
		return (longueur * largeur);
	}
	
	/**Longueur
	 * 
	 */
	double longueur;
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public Rectangle(double longueur, double largueur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	double largeur;
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	

}
