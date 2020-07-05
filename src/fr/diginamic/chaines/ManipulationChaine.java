package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("la longueur est " + chaine.length());
		System.out.println("L'index du premier caractère " + chaine.indexOf(';'));

		int indexPointVirgule = chaine.indexOf(';');
		String nom = chaine.substring(0, indexPointVirgule);
		System.out.println("Le nom est " + nom);

		/*
		 * la méthode toUpperCase() pour afficher le nom de famille en majuscules
		 */

		System.out.println("Afficher le nom en Majuscule " + nom.toUpperCase());

		/*
		 * la méthode toLowerCase() pour afficher le nom de famille en miniscule.
		 */

		System.out.println("Affficher le nom en Miniscule " + nom.toLowerCase());

		/*
		 * la méthode split pour découper la chaine de caractères en morceaux
		 */
		String[] decouper = chaine.split(";");
		for (int i = 0; i < decouper.length; i++) {
			System.out.println("Découper le morceaux " + i + " : " + decouper[i]);
		}
		
	}

}