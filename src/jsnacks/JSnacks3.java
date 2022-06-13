package jsnacks;

import java.util.Random;

public class JSnacks3 {

	public static void main(String[] args) {
		/*
		 * Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una lista
		 * di cognomi, genera una falsa lista di 3 invitati
		 */

		// lista nomi
		String[] nomi = { "Federica", "Andrea", "Giulia", "Matteo", "Lia" };

		// lista cognomi
		String[] cognomi = { "Cetroni", "Tarantino", "Cavalca", "Rossi", "Bianchi" };

		Random randomGen = new Random();

		// String primo = nomi[randomGen.nextInt(nomi.length)] + " " +
		// cognomi[randomGen.nextInt(cognomi.length)];
		// String secondo = nomi[randomGen.nextInt(nomi.length)] + " " +
		// cognomi[randomGen.nextInt(cognomi.length)];
		// String terzo = nomi[randomGen.nextInt(nomi.length)] + " " +
		// cognomi[randomGen.nextInt(cognomi.length)];

		// lista
		String[] fake = new String[3];

		for (int i = 0; i < fake.length; i++) {
			int index = randomGen.nextInt(nomi.length);
			String nomeCasuale = nomi[index];
			index = randomGen.nextInt(cognomi.length);
			String cognomiCasuali = cognomi[index];
			// System.out.println(index);
			// System.out.println(nomi[index]);

			fake[i] = nomeCasuale + " " + cognomiCasuali;
			System.out.println(fake[i]);
		}
		// System.out.println("Lista Invitati: ");
		// System.out.println(primo);
		// System.out.println(secondo);
		// System.out.println(terzo);

		/*
		 * ALTRO MODO
		 */

	}

}
