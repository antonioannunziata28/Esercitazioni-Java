package corso.udemy;

import java.util.Iterator;

public class EsArray4Main {

	public static void main(String[] args) {
//		scrivere un programma per visualizzare il triangolo di Pascal
		
	
		int n = 5;
		int[][] matrice = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if(j==0 || j==i) {
					matrice[i][j] = 1;
				} else {
					int tmp = matrice[i-1][j-1] + matrice[i-1][j];
					matrice[i][j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrice[i][j]);
			}
			System.out.println("");
		}
	}

}
