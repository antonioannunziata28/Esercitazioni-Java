package corso.udemy;

public class MatriciMain {

	public static void main(String[] args) {
		
		//Come si dichiara un array
		int[] arrayUnidimensionale = new int[5];
		
		//Una matrice è un array di array e può essere considerata come una tabella
		//dove l'array di partenza corrisponde alle righe della tabella
		//e l'array annidato corrisponde alle colonne di questa tabella
		
		
		//Come si dichiara una matrice
		
		int[][] matrice = new int[5][10]; //In questo modo la matrice ha 5 righe e 10 colonne
		
		//Come si popola una matrice
		
		matrice[0][0] = 30; //In questo modo alla riga 0 e colonna 0 avremo il valore 30
		matrice[1][2] = 10; //In questo modo avremo alla riga 1 e colonna 2 il valore 10 
		
		//Come si stampano i valori di una matrice
		
		for(int riga = 0; riga < matrice.length; riga++) {
			for(int colonna = 0; colonna < matrice[riga].length; colonna++) {
				System.out.print(matrice[riga][colonna] + " ");
			}
			System.out.println();
		}
	}
}
