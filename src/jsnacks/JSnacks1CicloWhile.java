package jsnacks;

import java.util.Scanner;

public class JSnacks1CicloWhile {

	public static void main(String[] args) {
		/*
		 * Il software deve chiedere per 5 volte all’utente di inserire un numero. Il
		 * programma stampa la somma di tutti i numeri inseriti. Esegui questo programma
		 * in due versioni, con il for e con il while.
		 */

		Scanner numUtente = new Scanner(System.in);
		int N = 5; // numeri da sommare alla fine
		int contaNum = 1; // conta i num inseriti dall'utente
		int somma = 0; // somma num inseriti
		int num; // ultimo num letto

		while (contaNum <= N) {
			System.out.println("Inserisci un numero: ");
			num = numUtente.nextInt();
			somma = somma + num;
			contaNum++;
		}

		System.out.println("La somma dei tuoi numeri è: " + somma);

		/*
		 * Altro modo int count = 0; while (count <5) { sysout (Dimmi un numero) summa
		 * += scan.nextInt(); count++; }
		 */

		numUtente.close();

	}

}
