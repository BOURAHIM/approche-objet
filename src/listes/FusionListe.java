package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	
	public static void main(String args[]) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
			
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
	
		List<String> liste3 = new ArrayList<>();
		for(int i = 0; i < liste1.size() ; i++) {
			String elt = liste1.get(i);
			liste3.add(elt);
		}
		
		for(int j = 0; j < liste2.size() ; j++) {
			String elt = liste2.get(j);
			liste3.add(elt);
		}
		
		System.out.println(liste3);
	}
	

}
