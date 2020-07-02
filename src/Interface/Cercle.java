package Interface;

public class Cercle implements objetGeometrique {

	@Override
	public double perimetre() {
		return (rayon * 2*3.14);
	}

	@Override
	public double surface() {
		return ((rayon*rayon)*3.14);
	}
	
	double rayon;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
}
