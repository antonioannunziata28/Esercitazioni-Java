package it.udemy.main;

import it.udemy.classi.*;

public class Main {

	public static void main(String[] args) {
//		Scrivere una classe Impiegato che rappresenti matricola, cognome, nome, e retribuzione di un 
//		impiegato, Una classe Ufficio che contenga un array di impiegati. Si dotino entrambe le classi
//		di un costruttore parametrizzato, e si inserisca nella classe Ufficio un metodo media che accetti
//		in ingresso un array di matricole M e calcoli la media delle retribuzioni degli impiegati
//		dell'ufficio che hanno le matricole contenute in M. Dotare la classe Ufficio di metodo che accetti
//		in ingresso un array di impiegati A e restituisce i cognomi di tutti i dipendenti dell'Ufficio che
//		hanno retribuzioni piu alte della retribuzione media degli impiegati contenuti in A.

		
		Impiegato imp1 = new Impiegato(1, "Pagano", "Antonio", 30000);
		Impiegato imp2 = new Impiegato(2, "Annunziata", "Antonio", 35000);
		Impiegato imp3 = new Impiegato(3, "Pallino", "Pinko", 45000);
		Impiegato imp4 = new Impiegato(4, "Doe", "John", 55000);
		
		Impiegato[] elencoImpiegati = new Impiegato[4];
		elencoImpiegati[0] = imp1;
		elencoImpiegati[1] = imp2;
		elencoImpiegati[2] = imp3;
		elencoImpiegati[3] = imp4;
		
		Ufficio ufficio = new Ufficio(elencoImpiegati);
		
		int[] m = new int[4];
		m[0] = 2;
		m[1] = 3;
		m[2] = 40;
		m[3] = 10;
		
		int media = ufficio.media(m);
		System.out.println(media);
		
		String[] res = ufficio.dipendentiPiuPagati(m);
		for(String string : res) {
			if(string != null) {
			System.out.println(string);
			}
		}
		
		
	}

}
