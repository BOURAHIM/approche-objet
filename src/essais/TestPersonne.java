package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

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
		
		Personne personne1 = new Personne();
		personne1.nom = "Ali";
		personne1.prenom = "Bao";
		personne1.adresse = "adresse1";
		
		Personne personne2 = new Personne();
		personne2.nom = "Madi";
		personne2.prenom = "Humadi";
		personne2.adresse = "adresse2";
	}

}
