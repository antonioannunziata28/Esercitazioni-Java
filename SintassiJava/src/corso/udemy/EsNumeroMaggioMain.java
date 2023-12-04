package corso.udemy;

import java.util.Scanner;

public class EsNumeroMaggioMain {

	public static void main(String[] args) {
		//Scrivi un programma che prenda due numeri in input e restituisca quello maggiore
		
		System.out.println("Questo programma ha il compito di mostrarti il numero maggiore tra due numeri da te forniti");
		System.out.println("Inserisci il primo numero");
		Scanner scanner = new Scanner(System.in);
		int primo = scanner.nextInt();
		System.out.println("Ora inserisci il secondo numero");
		int secondo = scanner.nextInt();
		scanner.close();
		
		if(primo > secondo) {
			System.out.println("Il numero maggiore è: " + primo);
		}else if (primo < secondo) {
			System.out.println("Il numero maggiore è: " + secondo);
		}else if(primo == secondo) {
			System.out.println("I numeri inseriti sono uguali");
		}else {
			System.out.println("Inserisci un valore numerico valido");
		}

	}

}
