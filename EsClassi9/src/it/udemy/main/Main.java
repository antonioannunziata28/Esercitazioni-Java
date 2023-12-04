package it.udemy.main;

import it.udemy.classi.Libreria;
import it.udemy.classi.Libro;

public class Main {

	public static void main(String[] args) {
//		Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro:
//			titolo, autore, prezzo
//		e che contenga: il costruttore parametrizzato, i metodi get e setter, 
//		
//		Scrivere poi una classe Libreria, che rappresenti un insieme di libri tramite un array di tipo Libro e che contenga
//		il costruttore parametrizzato, un metodo trvoa che accetta in ingresso un autore A e intero k e restituisce 
//		il numero di libri contenuti nella libreria aventi autore A e prezzo superiore a k.
//		
//		Aggiungere alla classe Libreria un metodo che accetti un autore A e restituisca i titoli di tutti i libri scritti dall'autore A

		Libro libro = new Libro("Lupo e il mare", "Dante", 30);
		Libro libro1 = new Libro("Divina Commedia", "Dante", 28);
		Libro libro2 = new Libro("100000 leghe sotto i mari", "Pascoli", 10);
		
		Libro[] lista = new Libro[10];
		lista[0] = libro;
		lista[1] = libro1;
		lista[2] = libro2;
		
		Libreria libreria = new Libreria(lista);
		Libro[] r = libreria.ricercaPerAutorePrezzoMaggiore("Dante", 20);
		for (int i = 0; i < r.length; i++) {
			if(r[i] != null) {
				System.out.println(r[i].getNome());
			}
			
		}
		
		String[] result = libreria.ricercaPerAutore("Pascoli");
		for(int i = 0; i < result.length; i++) {
			if(result[i] != null) {
				System.out.println(result[i]);
			}
			
		}
	}

}
