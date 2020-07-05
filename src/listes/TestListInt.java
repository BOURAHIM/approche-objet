package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> Liste = new ArrayList<>();
		Liste.add(-4);
		Liste.add(-2);
		Liste.add(-1);
		Liste.add(3);
		Liste.add(5);
		Liste.add(7);
		Liste.add(8);

		/*
		 * Affichez tous les éléments de la liste
		 */
		for (Integer integer : Liste) {
			System.out.println(integer);
		}

		System.out.println("______Question suivant_______");

		System.out.println(Liste.size());

		System.out.println("______Question suivant_______");

		/*
		 * Affiche la taille de la liste
		 */
		int max = 0;
		for (int i = 0; i < Liste.size(); i++) {
			if (Liste.get(i) > max) {
				max = Liste.get(i);

			}
			System.out.println(max);
		}

		System.out.println("______Question suivant_______");

		/*
		 * Recherche et affiche le plus grand élément de la liste
		 */
		Integer min = 0;
		for (int i = 0; i < Liste.size(); i++) {
			if (Liste.get(i) < min) {
				min = Liste.get(i);
			}
		}
		Liste.remove(min);
		System.out.println(min);

		System.out.println("______Question suivant_______");

		/*
		 * Recherche tous les éléments négatifs et modifie les de manière à ce qu’ils
		 * deviennent positifs.
		 */

		for (int i = 0; i < Liste.size(); i++) {
			if (Liste.get(i) < 0) {
				Liste.set(i, Math.abs(Liste.get(i))); //Math.abs convertir negatif en positif
			}
		}

		for (int i = 0; i < Liste.size(); i++) {
			System.out.println(Liste.get(i));
		}
	}

}
