package fr.diginamic.essais;

import fr.diginamic.entites.CompteBancaire;

/**Test compte bancaire
 * @author BOURA Troulé
 *
 */
public class TestCompteBancaire {

	public static void main(String[] args) {
		CompteBancaire compteBancaire = new CompteBancaire("FR1254", 50, "Albi");
		System.out.println("Credit montant " + compteBancaire.crediterMontant());
		System.out.println("Débite montant " + compteBancaire.debiterMontant());
		System.out.println("Numero compte" + compteBancaire.toString());
	}

}
