package it.udemy.main;

import it.udemy.classi.Persona;

public class Main {

	public static void main(String[] args) {
//		Definire una classe Persona che rappresenti oggetti di tipo persona(nome,cognome,indirizzo,numero di telefono) indicandone
//		il costruttore con i rispettivi parametri. La classe persona deve presentare inoltre:
//			I rispettivi metodi di accesso alle variabili di istanza di classe.
//			Il metodo equals che, data una persona restituisce un valore booleano corrispondente all'equivalenza dei dati forniti con
//			quelli della persona corrente
//			il metodo toString che restituisce la stringa corrispondente ai dati della persona corrente, separati da virgole.

		
		Persona persona = new Persona("Antonio", "Annunziata", "Via Fasulla 123", 33131);
		Persona persona1 = new Persona("Giuseppe", "Rossi", "Via Paga 123", 32432);
		Persona persona2 = new Persona("Antonio", "Annunziata", "Via Fasulla 123", 33131);
		
		System.out.println(persona);
		System.out.println(persona1);
		System.out.println(persona2);
		
		System.out.println(persona.equals(persona1));
	}

}
