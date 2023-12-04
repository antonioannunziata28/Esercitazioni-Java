package corso.udemy;

import java.util.Scanner;

public class EsArray6Main {

	public static void main(String[] args) {
		System.out.println("Scrivi un programma per trovare la penultima parola di una frase presa in input");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci la frase");
		String inputString = scanner.nextLine();
		scanner.close();
		
		String[] arrayString = inputString.split(" ");
		
		System.out.println(arrayString[arrayString.length -2]);
		
		

	}

}
