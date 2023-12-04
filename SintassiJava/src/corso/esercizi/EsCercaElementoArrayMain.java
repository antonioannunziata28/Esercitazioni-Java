package corso.esercizi;

import java.util.Scanner;

public class EsCercaElementoArrayMain {

	public static void main(String[] args) {
		
		System.out.println("Cerca un elemento specifico in un array e restituisci la sua posizione. Se l'elemento"
				+ " non è presente, mostra un messaggio appropriato");
		
		int[] array = {10,21,33,1,4,3,18,34, 134};
		System.out.println();
		
		//Stampo l'array
		System.out.println("Questi sono i valori dell'array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Ora inserisci il numero che vuoi cercare?");
		
		Scanner scanner = new Scanner(System.in);
		int toFind = scanner.nextInt();
		scanner.close();
		
		//Ora cerchiamo il numero fornito dall'utente
		//In questo modo se trova l'elemento prima della fine dell'array termina
		boolean trovato = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == toFind) {
				System.out.println("Il numero che hai cercato si trova all'indice: " + i );
				trovato = true;
				break;
			}
		}
		
		//In questo modo stampa il messaggio di errore se l'elemento non viene trovato
		if(!trovato) {
			System.out.println("Mi dispiace ma il numero da te inserito non è presente");
		}
	}

}
