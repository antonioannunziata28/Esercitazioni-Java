package corso.udemy;

import java.util.Scanner;

public class EsMediaMain {
	
	/*
	 * Scrivi un programma java che accetta tre numeri come input e stampi la media dei tre numeri
	 */

	public static void main(String[] args) {
		
		System.out.println("Questo esercizio serve per calcolare il valore medio dei tre input inseriti dall'utente");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo valore numerico");
		int primoValore = scanner.nextInt();
		System.out.println("Ora il secondo");
		int secondoValore = scanner.nextInt();
		System.out.println("Ora il terzo");
		int terzoValore = scanner.nextInt();
		scanner.close();
		
		int result = (primoValore + secondoValore + terzoValore) / 3;
		
		System.out.println("La media fra i tre valori inseriti è:" + result);
		
	}

}
