package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		
		/*
		 * Recherche la ville dans cette liste qui a le plus grand 
		 * nombre de lettres
		 */
		String ref = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if( ref > list.get(i)) {
				ref.length() = list.lenght();
			}
		}
	}

}
