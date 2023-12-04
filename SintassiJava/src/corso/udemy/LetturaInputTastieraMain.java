package corso.udemy;

import java.util.Scanner;

public class LetturaInputTastieraMain {

	public static void main(String[] args) {
		
		//Con la classe scanner possiamo finalmente prendere un valore di input fornitoci dalla tastiera
		
		//Si apre l'oggetto di classe Scanne e gli assegniamo un nome a noi noto in questo caso scanner
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Inserisci un numero");
		
		//In questo modo assegniamo ad r il valore inserito dal nostro utente letto grazie a scanner.nextInt();
		int r = scanner.nextInt();
		
		System.out.println("Il valore di r è: " + r);

	}

}
