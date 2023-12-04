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
		
		Telefonata tel1 = new Telefonata();
		tel1.setNumero(123);
		tel1.setDurata(100);
		tel1.setCosto(150);
		
		Telefonata tel2 = new Telefonata();
		tel2.setNumero(1213);
		tel2.setDurata(10);
		tel2.setCosto(21);
		
		Telefonata tel3 = new Telefonata();
		tel3.setNumero(123);
		tel3.setDurata(100);
		tel3.setCosto(150);
		
		Telefonata tel4 = new Telefonata();
		tel4.setNumero(1213);
		tel4.setDurata(10);
		tel4.setCosto(21);
		
		Telefonata tel5 = new Telefonata();
		tel5.setNumero(123);
		tel5.setDurata(100);
		tel5.setCosto(150);
		
		Telefonata tel6 = new Telefonata();
		tel6.setNumero(1213);
		tel6.setDurata(10);
		tel6.setCosto(21);
		
		Telefonata tel7 = new Telefonata();
		tel7.setNumero(123);
		tel7.setDurata(100);
		tel7.setCosto(150);
		
		Telefonata tel8 = new Telefonata();
		tel8.setNumero(1213);
		tel8.setDurata(10);
		tel8.setCosto(21);
		
		Telefonata tel9 = new Telefonata();
		tel9.setNumero(1213);
		tel9.setDurata(10);
		tel9.setCosto(21);
		
		Telefonata tel10 = new Telefonata();
		tel10.setNumero(123);
		tel10.setDurata(100);
		tel10.setCosto(150);
		
		Telefonata tel11 = new Telefonata();
		tel11.setNumero(1213);
		tel11.setDurata(10);
		tel11.setCosto(21);
		
		
		
		
		
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
