package it.udemy.dao;

import java.util.ArrayList;
import java.util.List;

import it.udemy.model.Impiegato;

public class ImpiegatoDao {

	List<Impiegato> listaImpiegato = new ArrayList<>();
	
	public void readAllList() {
		for (Impiegato impiegato : listaImpiegato) {
			System.out.println(impiegato);
		}
	}
	
	public Impiegato ricercaPerCodiceFiscale(String codiceFiscale) {
		for (Impiegato impiegato : listaImpiegato) {
			if(impiegato.getCodiceFiscale().equals(codiceFiscale)) {
				return impiegato;
			}
		}
		System.out.println("Nessuna corrispondenza trovata");
		return null;
	}
	
	public void createImpiegato(Impiegato impiegato) {
		listaImpiegato.add(impiegato);
		System.out.println("Impiegato inserito correttamente");
	}
	
	public void deleteImpiegato(Impiegato impiegatoDaEliminare) {
		boolean corrispondenzaTrovata = false;
		for (Impiegato impiegato : listaImpiegato) {
			if(impiegato.getCodiceFiscale().equals(impiegatoDaEliminare.getCodiceFiscale())) {
				listaImpiegato.remove(impiegato);
				System.out.println("Impiegato eliminato correttamente");
				corrispondenzaTrovata = true;
				break;
			}
		}
		if(!corrispondenzaTrovata) {
			System.out.println("Non è stata trovata alcuna corrispondenza");
		}
	}
	
	public void updateImpiegato(Impiegato impiegatoDaAggiornare) {
		boolean corrispondenzaTrovata = false;
		
		for (Impiegato impiegato : listaImpiegato) {
			if(impiegatoDaAggiornare.getCodiceFiscale().equals(impiegato.getCodiceFiscale())) {
				impiegato.setNome(impiegatoDaAggiornare.getNome());
				impiegato.setCognome(impiegatoDaAggiornare.getCognome());
				impiegato.setMatricola(impiegatoDaAggiornare.getMatricola());
				System.out.println("Impiegato aggiornato correttamente");
				corrispondenzaTrovata = true;
				break;
			} 
		}
		if(!corrispondenzaTrovata) {
			System.out.println("Corrispondenza non trovata");
		}
	}
}
