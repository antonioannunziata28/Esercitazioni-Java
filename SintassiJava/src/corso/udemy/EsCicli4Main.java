package corso.udemy;

import java.util.Scanner;

public class EsCicli4Main {

	/*
	 * Scrivere un programma per visualizzare la struttura del rombo numerico
	 *
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 123456
	 * 1234567
	 * 123456
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Scrivere un programma per visualizzare la struttura del rombo numerico");
		System.out.println("Inserisci il valore massimo da raggiungere");
		Scanner scanner = new Scanner(System.in);
		int numMax = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= numMax; i++) {
			for(int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for(int k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i = numMax-1; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(j);
			}
			
			for(int k = 2; k <= i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
		

	}

}
