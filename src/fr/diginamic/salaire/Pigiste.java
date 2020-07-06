package fr.diginamic.salaire;

/**
 * @author BOURA Troulé
 *
 */
public class Pigiste extends Intervenant{
private int nbJours;
private double montantJremu;


/**
 * @param nom
 * @param prenom
 * @param nbjours
 * @param montantJremu
 */
public Pigiste(String nom, String prenom, int nbJours, double montantJremu) {
	super(nom, prenom);
	this.nbJours = nbJours;
	this.montantJremu = montantJremu;
}

@Override
public double getSalaire() {
	return nbJours * montantJremu;
}

@Override
public String getStatut() {
	return "Pigiste";
}
}
