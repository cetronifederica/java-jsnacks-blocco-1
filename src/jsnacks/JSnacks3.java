package jsnacks;

import java.util.Random;

public class JSnacks3 {

	public static void main(String[] args) {
		/*Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		 * lista di cognomi, genera una falsa lista di 3 invitati*/

		
		String [] nomi = {"Federica" , "Andrea" , "Giulia"};
		String [] cognomi = {"Cetroni", "Tarantino", "Cavalca"};
		
		Random randomGen = new Random();
		
		String primo = nomi[randomGen.nextInt(nomi.length)] + " " + cognomi[randomGen.nextInt(cognomi.length)];
		String secondo = nomi[randomGen.nextInt(nomi.length)] + " " + cognomi[randomGen.nextInt(cognomi.length)];
		String terzo = nomi[randomGen.nextInt(nomi.length)] + " " + cognomi[randomGen.nextInt(cognomi.length)];
		
		System.out.println("Lista Invitati: ");
		System.out.println(primo);
		System.out.println(secondo);
		System.out.println(terzo);
		
	}

}
