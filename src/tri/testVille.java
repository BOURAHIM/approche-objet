package tri;

import java.util.ArrayList;
import java.util.Collections;

public class testVille {

	public static void main(String[] args) {
		ArrayList<Ville> arrayList = new ArrayList<>();
		
		arrayList.add(new Ville ("Carcassonne", 47_800));
		arrayList.add(new Ville ("Narbonne", 53_400));
		arrayList.add(new Ville ("Lyon", 484_000));
		arrayList.add(new Ville ("Foix", 9_700));
		arrayList.add(new Ville ("Pau", 77_200));
		arrayList.add(new Ville ("Marseille", 850_700));
		arrayList.add(new Ville ("Nice", 40_600));
		
		Collections.sort(arrayList);
		
		for(Ville ville: arrayList) {
			System.out.println(ville);
			
			/*
			 * HashMap<String, Integer> map = HashMap<>();
			 * 
			 * for( Ville v : liste){
			 * 
			 * Integer compteur = map.get(v.getDepartment());
			 * if(compteur==null){
			 * map.put(v.getDepartement(), 1);
			 * }
			 *  else{
			 *  compteur++;
			 *  map.put(v.getDepartement)), compteur);
			 */
		}
	}
}