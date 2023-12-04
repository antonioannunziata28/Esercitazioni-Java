package it.udemy.main;

import it.udemy.classi.Sim;
import it.udemy.classi.Telefonata;

public class Main {

	public static void main(String[] args) {
//		Creare una classe telefonata che memorizzi i seguenti dati:
//			-numero
//			-durata
//			-costo
//			
//		Creare una classe Sim con i seguenti dati:
//			-numero
//			-importo
//			-elenco ultime 10 telefonate effettuate
//			-elenco ulte 10 telefonate ricevute
//		aggiungere i seguenti metodi:
//			-aggiungi telefonata effettuata
//			-aggiungi telefonata ricevuta
//			-costo totale chiamata
//			-durata totale chiamata
		
		Telefonata tel1 = new Telefonata(3453, 5, 2);
		
		Telefonata tel2 = new Telefonata(3455, 15, 12);
		
		Telefonata tel3 = new Telefonata(3565, 2, 1);
		
		Telefonata tel4 = new Telefonata(6434, 53, 20);
		
		Telefonata tel5 = new Telefonata(6575, 10, 5);
		
		Telefonata tel6 = new Telefonata(35434, 3, 3);
		
		Telefonata tel7 = new Telefonata(53535, 24, 12);
		
		Telefonata tel8 = new Telefonata(35556, 11, 10);
		
		Telefonata tel9 = new Telefonata(35575, 8, 4);
		
		Telefonata tel10 = new Telefonata(3556, 3, 3);
		
		Telefonata tel11 = new Telefonata(3235, 11, 4);
		
		
		
		
		Sim sim1 = new Sim();
		sim1.aggiungiTelefonataFatta(tel1);
		sim1.aggiungiTelefonataFatta(tel2);
		sim1.aggiungiTelefonataFatta(tel3);
		sim1.aggiungiTelefonataFatta(tel4);
		sim1.aggiungiTelefonataFatta(tel5);
		sim1.aggiungiTelefonataFatta(tel6);
		sim1.aggiungiTelefonataFatta(tel7);
		sim1.aggiungiTelefonataFatta(tel8);
		sim1.aggiungiTelefonataFatta(tel9);
		sim1.aggiungiTelefonataFatta(tel10);
		sim1.aggiungiTelefonataFatta(tel11);

		sim1.stampaTelFatte();
		sim1.costoTotaleTelefonate();
		sim1.durataTotaleTelefonate();
		
	}

}
