package corso.udemy;

import java.util.Scanner;

public class EsCicli2Main {

	public static void main(String[] args) {
		/*
		 * Scrivere un programma per trovare tutte le terzine uniche in modo tale che la somma di tutti i e tre
		 * gli elementi sia uguale ad un numero specificato
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Scrivere un programma per trovare tutte le terzine uniche in modo tale che la somma di tutti i e tre\n"
				+ " gli elementi sia uguale ad un numero specificato");
		
		System.out.println();
		System.out.println("Inserisci il numero");
		int inputNumber = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i < inputNumber; i++) {
			for(int y = i +1; y < inputNumber; y++) {
				for(int z = y+1; z<inputNumber; z++) {
					if(i + y + z == inputNumber) {
						System.out.println(i + " + " + y + " + " + z + " = " + inputNumber);
					}
				}
			}
		}


	}

}
