package jsnacks;

import java.util.Scanner;

public class JSnacks1 {

	public static void main(String[] args) {
		/*
		 * Il software deve chiedere per 5 volte all’utente di inserire un numero. Il
		 * programma stampa la somma di tutti i numeri inseriti. Esegui questo programma
		 * in due versioni, con il for e con il while.
		 */

		Scanner numUtente = new Scanner(System.in);
		int N = 5; // valori da sommare alla fine
		int conta = 1; // conta i valori inseriti dall'utente
		int somma = 0; // somma dei valori letti
		int num; // ultimo valore letto

		// chiedo all'utente di inserire un numero x 5 volte

		for (conta = 1; conta <= N; conta++) {
			System.out.print("Immetti un intero: ");
			num = numUtente.nextInt();
			somma = somma + num;
		}

		System.out.println("La somma dei tuoi numeri è: " + somma);

		// altro modo
		// int somma = 0;
		// for (int i = 0; i < 5; i++) {
		// sysout ("Inserisci un numero");
		// somma += num;
		// }
		// sysout (La somma è + num);

		numUtente.close();

	}

}
