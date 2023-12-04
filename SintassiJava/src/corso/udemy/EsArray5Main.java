package corso.udemy;

import java.util.Scanner;

public class EsArray5Main {

	public static void main(String[] args) {
		
//		Stampare tutti i numeri compresi tra a e b dati da tastiera e dopo averli stampati inserirli
//		in un array che li ristampi al contrario
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire il numero a");
		int a = scanner.nextInt();
		System.out.println("Inserire il numero b");
		int b = scanner.nextInt();
		scanner.close();
		
		int sizeArray = 0;
		for (int i = a; i <= b; i++) {
			sizeArray++;
		}
		
		int[] array = new int[sizeArray];
		int posizione = 0;
		for (int i = a; i <= b; i++) {
			System.out.print(i + ",");
			array[posizione] = i;
			posizione++;
		}
		
		System.out.println();
		
		System.out.println("Ordine inverso");
		for (int i = array.length -1; i >= 0; i--) {
			System.out.print(array[i] + ",");
		}
		
		
		
		
		
		
	}

}
