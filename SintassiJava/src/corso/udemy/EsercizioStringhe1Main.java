package corso.udemy;

import java.util.Scanner;

public class EsercizioStringhe1Main {

	public static void main(String[] args) {
		
		/*Scrivere un programma che, preso in input da tastiera una stringa e un numero,
		 * stampa il carattere che si trova nella posizione indicata dal numero preso in input.
		 * 
		 */
		
		System.out.println("preso in input da tastiera una stringa e un numero stamperemo il "
				+ "carattere che si trova nella posizione indicata dal numero");
		
		System.out.println("Inserisci una frase");
		
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.next();
		
		System.out.println("Ora inserisci un numero intero");
		int numero = scanner.nextInt();
		
		
		char result = frase.charAt(numero);
		
		System.out.println("dato il numero inserito: " + numero + " corrispone alla lettera: " + result);
		System.out.println("ricorda che si cominica a contare dal numero 0");
		
		/*
		 * Scrivere un programma che, prese due stringhe in input, stampi la loro unione.
		 */
		
		System.out.println("prese due stringhe in input, stampi la loro unione");
		System.out.println("per prima stringa utilizzeremo quella inserita in precedenza cioè: " + frase);
		System.out.println("ora inserisci la seconda stringa");
		String frase1 = scanner.next();
		scanner.close();
		System.out.println("il risultato della concatenazione fra le due stringhe è: " + frase + frase1);
	}

}
