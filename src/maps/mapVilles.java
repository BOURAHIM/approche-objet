package maps;

import java.util.HashMap;

public class mapVilles {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();

		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		/*
		 * affiche l'ensemble des clés contenues dans la map
		 */

		for (Integer cle : mapVilles.keySet()) {
			System.out.println("Les clés sont " + cle);
		}

		System.out.println("_________Question Suivant_________");

		/*
		 * affiche l'ensemble des values contenues dans la map
		 */
		for (String value : mapVilles.values()) {
			System.out.println("Les valeurs sont " + value);
		}

		System.out.println("_________Question Suivant_________");

		/*
		 * affiche la taille de la map
		 */
		System.out.println("La taille est " + mapVilles.size());
		System.out.println("_________Exercice 4_________");

	}
}