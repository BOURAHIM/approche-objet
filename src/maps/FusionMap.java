package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {

		// Création map1
		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		HashMap<Integer, String> map2 = new HashMap<>();

		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<>();
		for (int i = 0; i < map1.size(); i++) {
			map3.putAll(map1); // S'ils sont les memes valeurs
		}
		System.out.println(map3);

	}

}