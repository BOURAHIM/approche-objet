package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * @author BOURA Troulé
 *
 */
public class LectureFichier {

	/**
	 * la Class File du package java.io permet de déclarer l'emplacement sans lire
	 * le fichier
	 * 
	 * @param Emplacement fichier
	 */
	/**
	 * la Classe FileUtils de commons-io pour lire le fichier avec la methode
	 * readLines qui permet de lire le fichier
	 * 
	 * @param ligne
	 */
	/**
	 * Interception de l'exception Dans le bloc try on place l’instruction
	 * susceptible de renvoyer une exception, et dans le bloc catch on indique ce
	 * qu’on fait si l’exception se produit.
	 * 
	 * @param e.getMessage ou lecture fichier recensement
	 */
	public static void main(String[] args) {

		try {
			File file = new File("C:\\Diginamic\recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			for(String ligne : lignes) {
				System.out.println(ligne);
			}
			
			System.out.println("Nombre de lignes : " + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
