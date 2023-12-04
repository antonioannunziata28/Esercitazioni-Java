package corso.udemy;

import java.util.Iterator;

public class EsArray3Main {

	public static void main(String[] args) {
		
//		Scrivere un programma per trovare il piu piccolo e il secondo piu piccolo elemento
//		di un dato array

		int[] tmp = {10,3,5,32,2,6,1};
		
		int min = tmp[0];
		
		//troviamo il piu piccolo
		for (int i = 1; i < tmp.length; i++) {
			if(tmp[i] < min) {
				min = tmp[i];
			}
		}
		
		//troviamo il secondo piu piccolo
		int minSecondo = tmp[1];
		
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] < minSecondo && tmp[i] != min)
				minSecondo = tmp[i];
		}
		
		System.out.println("il minimo è:" + min);
		System.out.println("il secondo minimo è:" + minSecondo);
	}
	

}
