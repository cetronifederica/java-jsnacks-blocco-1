package jsnacks;

import java.util.Scanner;

public class JSnacks2 {

	public static void main(String[] args) {
		/*
		 * Chiedi all'utente di inserire un numero, se � pari stampa il numero, se �
		 * dispari stampa il numero successivo
		 */

		Scanner numUtente = new Scanner(System.in);
		int num;

		// chiedo all'utente di inserire un numero

		System.out.println("Immetti un numero: ");
		num = numUtente.nextInt();
		if (num % 2 == 0) {
			System.out.println(num);
		} else {
			System.out.println(num + 1);
		}
		numUtente.close();
	}

	// sysout(++num); --> altro modo di andare avanti con un numero in pi�
	// il ++ viene messo sulla sinistra della variabile perch� cos� viene eseguito
	// prima il ++

}
