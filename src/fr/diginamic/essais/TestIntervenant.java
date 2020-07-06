package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("BOURAHIM", "Iyan", 1200);
		System.out.println("Le salarié : "+salarie.getSalaire());
		
		Pigiste pigiste = new Pigiste("MICHEL", "Pierre", 30, 50);
		System.out.println("Le pigiste :" +pigiste.getSalaire());
		

	}

}
