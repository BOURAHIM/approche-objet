package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 189;
		adresse1.libelleRue = "Rue marie gouz";
		adresse1.codePostale = 34000;
		adresse1.ville = "Montpellier";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 19;
		adresse2.libelleRue = "Rue saumure";
		adresse2.codePostale = 49000;
		adresse2.ville = "Angers";
			
	}

}
