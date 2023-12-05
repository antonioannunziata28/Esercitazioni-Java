package it.udemy.main;

import it.udemy.classi.Carta;

public class Main {

	public static void main(String[] args) {
//		Si realizzi una classe Carta che rappresenta una carta da gioco. Tale classe ha due attributi: 
//		valore e seme di tipo String. La classe codifica un metodo costruttore a due argomenti e definisce 
//		un metodo equals(Object x) che controlla l’uguaglianza di due carte in base all’uguaglianza di valore
//		e seme.
		
		Carta carta1 = new Carta("9", "picche");
		Carta carta2 = new Carta("9", "picche");
		Carta carta3 = new Carta("3", "quadri");
		
		System.out.println(carta1.equals(carta2));
		System.out.println(carta1.equals(carta3));
	}

}
