package it.udemy.main;

import it.udemy.classi.AereoMotore;
import it.udemy.classi.Aliante;

public class Main {

	public static void main(String[] args) {
//		In un'aerodromo si vuole mantenere le informazioni sugli aeromobili. Di ogni aeromobile si vuole sapere la sigla (string) 
//		che lo identifica. Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive l'efficienza aereodinamica.
//		Degli aerei a motore si vuole sapere la potenza in CV del motopropulsore (double).Aeromobili dello stesso tipo devono 
//		essere confrontabili fra loro in modo da poter stabilire quale sia quello con prestazioni migliori.
//		Gli alianti si confrontano in base all'efficienza; gli aerei a motore in base alla potenza in CV.
//		Vogliamo essere un grado di verificare se un aeromibile è superione adun altro come prestazioni.

		Aliante aliante1 = new Aliante("AL01", 100);
		Aliante aliante2 = new Aliante("AL02", 159);
		
		AereoMotore aMotore1 = new AereoMotore("A01", 200);
		AereoMotore aMotore2 = new AereoMotore("A02", 250);
		
		System.out.println(aliante2.compareTo(aliante1));
		System.out.println(aMotore1.compareTo(aMotore2));
	}

}
