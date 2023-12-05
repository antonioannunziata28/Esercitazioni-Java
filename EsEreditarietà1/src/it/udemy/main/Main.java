package it.udemy.main;

import it.udemy.model.Figlio1;
import it.udemy.model.Figlio2;

public class Main {

//	Creare una classe astratta 'Parent', con un metodo 'getMessage' e due sottoclassi, ciascuna con un metodo
//	con lo stesso nome 'getMessage' che stampi rispettivamente 'Questa è la prima sottoclasse' e 'Questa è la 
//	seconda sottoclasse'. Chiamare i metodi 'getMessage' creando un oggetto per ogni sottoclasse.
	
	public static void main(String[] args) {
		
		Figlio1 f1 = new Figlio1();
		f1.getMessage();
		
		System.out.println("------------------------------");
		
		Figlio2 f2 = new Figlio2();
		f2.getMessage();

	}

}
