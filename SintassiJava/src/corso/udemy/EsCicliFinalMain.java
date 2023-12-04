package corso.udemy;

import java.util.Scanner;

public class EsCicliFinalMain {

	public static void main(String[] args) {
		
		//Scrivere un programma per visualizzare la tabella di moltiplicazione dato un numero intero

		System.out.println("Scrivere un programma per visualizzare la tabella di moltiplicazione dato un numero intero");
		System.out.println();
		System.out.println("Inserisci il numero di cuoi vuoi conoscere la tabellina fino al 10");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i <=10; i++) {
			System.out.print(number * i + ",");
		}
	}

}
