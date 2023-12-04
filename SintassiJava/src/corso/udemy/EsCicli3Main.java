package corso.udemy;

import java.util.Scanner;

public class EsCicli3Main {

	public static void main(String[] args) {
		/*
		 * SCRIVERE UN PROGRAMMA PER VISUALIZZARE IL MODELLO COME UN TRIANGOLO AD ANGOLO RETTO CON UN NUMERO
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */

		System.out.println("SCRIVERE UN PROGRAMMA PER VISUALIZZARE IL MODELLO COME UN TRIANGOLO AD ANGOLO RETTO CON UN NUMERO");
		
		System.out.println("Inserisci il numero di righe che vuoi");
		Scanner scanner = new Scanner(System.in);
		int numRighe = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= numRighe; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
