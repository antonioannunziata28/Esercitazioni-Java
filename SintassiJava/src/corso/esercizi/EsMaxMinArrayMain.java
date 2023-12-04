package corso.esercizi;

public class EsMaxMinArrayMain {

	public static void main(String[] args) {
		
		System.out.println("Scrivi un programma che trova il valore massimo e il valore minimo in un array di numeri interi");
		
		int[] array = {10,21,33,1,4,3,18,34, 134};
		
		System.out.println("Questi sono i valori dell'array");
		//Stampo l'array
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Trovo il valore minimo 
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println();
		System.out.println("Il valore minimo è: " + min);
		
		//Trovo il valore massimo
		int max = array[1];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
	
		System.out.println("Il valore massimo è: " + max);

	}

}
