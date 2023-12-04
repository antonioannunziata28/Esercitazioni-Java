package it.udemy.classi;

import java.util.Iterator;

public class Sim {

	private int numSim;
	private int importo;
	private Telefonata[] telefonateEffettuate = new Telefonata[10];
	private Telefonata[] telefonateRicevute = new Telefonata[10];
	
	
	public void durataTotaleTelefonate() {
		int durataTotale = 0;
		for (int i = telefonateEffettuate.length -2; i >= 0; i--) {
			durataTotale += telefonateEffettuate[i].getDurata();
		}
		System.out.println("Durata totale " + durataTotale);
	}
	
	public void costoTotaleTelefonate() {
		int costoTotale = 0;
		for (int i = telefonateEffettuate.length -2; i >= 0; i--) {
			costoTotale += telefonateEffettuate[i].getCosto();
		}
		System.out.println("Costo totale " + costoTotale);
	}
	
	public void aggiungiTelefonataFatta(Telefonata telFatta) {
		for (int i = telefonateEffettuate.length -2; i >= 0; i--) {
			telefonateEffettuate[i + 1] = telefonateEffettuate[i];
		}
		telefonateEffettuate[0] = telFatta;
	}
	
	public void aggiungiTelefonataRicevuta(Telefonata Ricevuta) {
		for (int i = telefonateRicevute.length -2; i >= 0; i--) {
			telefonateRicevute[i + 1] = telefonateRicevute[i];
		}
		telefonateRicevute[0] = Ricevuta;
	}
	
	public void stampaTelFatte() {
		System.out.println("Elenco ultime 10 telefonate effettuate:");
		for(int i = 0; i < telefonateEffettuate.length; i++) {
			if(telefonateEffettuate[i] != null) {
				System.out.println(telefonateEffettuate[i].getNumero());
			}
			
		}
	}
	
	public void stampaTelRicevute() {
		System.out.println("Elenco ultime 10 telefonate ricevute:");
		for(int i = 0; i < telefonateRicevute.length; i++) {
			if(telefonateRicevute[i] != null) {
				System.out.println(telefonateRicevute[i].getNumero());
			}
			
		}
	}
}
