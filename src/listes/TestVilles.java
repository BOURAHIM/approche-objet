package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> arrayList = new ArrayList<>();

		arrayList.add(new Ville("Carcassonne", 47_800));
		arrayList.add(new Ville("Narbonne", 53_400));
		arrayList.add(new Ville("Lyon", 484_000));
		arrayList.add(new Ville("Foix", 9_700));
		arrayList.add(new Ville("Pau", 77_200));
		arrayList.add(new Ville("Marseille", 850_700));
		arrayList.add(new Ville("Nice", 40_600));

		Ville ville = arrayList.get(0);
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getNbHabitant() > ville.getNbHabitant()) {
				ville = arrayList.get(i);
			}

		}
		System.out.println("La plus grande ville est " + ville.getNom() + ", avec nom de " + ville.getNbHabitant()
		+ " d'habitants.");
	}

}
