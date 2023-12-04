package corso.esercizi;

//import java.util.Arrays;

public class EsSommaArrayMain {

	public static void main(String[] args) {
		
//		Scrivi un programma che dichiara un array di numeri interi e calcola la somma di tutti gli elementi
//		presenti nell'array
		
		System.out.println("Scrivi un programma che dichiara un array di numeri interi e calcola la somma di tutti gli elementi"
							+ "presenti nell'array");
		
		int[] array = {10,21,33,1,4,3};
		
		System.out.println();
		System.out.println("Questo è l'array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Questa è la somma");
		int somma = 0;
		for(int i = 0; i < array.length; i++) {
			somma += array[i];
		}
		//Oppure direttamente
//		int somma = Arrays.stream(array).sum();
		
		System.out.println(somma);

	}

}
