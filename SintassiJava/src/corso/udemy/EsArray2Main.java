package corso.udemy;

public class EsArray2Main {

	public static void main(String[] args) {
//		Scrivere un programma per separare i numeri pari e dispari di un dato array di numeri interi
//		Mettere prima tutti i numeri pari e poi i numeri dispari
		
		int[] tmp = {3,4,7,10,30,37,50};
		
		int[] tmp2 = new int[7];
		
		//trovo i numeri pari
		int posPari = 0; //variabile in cui salvare la prima posizione disponibile dell'array
		
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] % 2 == 0) {
				tmp2[posPari] = tmp[i];
				posPari++;
			}
		}
		
		//trovo i numeri pari
		int posDispari = posPari; //variabile in cui salvare la prima posizione disponibile dell'array
				
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] % 2 != 0) {
				tmp2[posDispari] = tmp[i];
				posDispari++;
			}
		}
		
		//Stampiamo il nuovo array ordinato
		for (int i = 0; i < tmp2.length; i++) {
			System.out.print(tmp2[i] + ",");
		}

	}

}
