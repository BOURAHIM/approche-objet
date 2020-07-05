package maps;

import java.util.ArrayList;
import java.util.HashMap;

import listes.Ville;

public class Exemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> arrayList = new ArrayList<>();

		arrayList.add(new Ville("Carcassonne", 47_800));
		arrayList.add(new Ville("Narbonne", 53_400));
		arrayList.add(new Ville("Lyon", 484_000));
		arrayList.add(new Ville("Foix", 9_700));
		arrayList.add(new Ville("Pau", 77_200));
		arrayList.add(new Ville("Marseille", 850_700));
		arrayList.add(new Ville("Nice", 40_600));
		
		HashMap<Ville, String> map3 = new HashMap<>();
		for(String value : map3) {
			
		}
	}

}
