package fr.diginamic.essais;

import fr.diginamic.entites.CompteBancaire;

/**Test compte bancaire
 * @author BOURA Troul�
 *
 */
public class TestCompteBancaire {

	public static void main(String[] args) {
		CompteBancaire compteBancaire = new CompteBancaire("FR1254", 50, "Albi");
		System.out.println("Credit montant " + compteBancaire.crediterMontant());
		System.out.println("D�bite montant " + compteBancaire.debiterMontant());
		System.out.println("Numero compte" + compteBancaire.toString());
	}

}
