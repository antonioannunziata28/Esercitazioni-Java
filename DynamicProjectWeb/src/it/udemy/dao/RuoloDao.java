package it.udemy.dao;

import java.util.ArrayList;
import java.util.List;

import it.udemy.model.Ruolo;

public class RuoloDao {

	private List<Ruolo> listaRuoli = new ArrayList<>();
	
	public void readAllRole() {
		for(Ruolo ruolo : listaRuoli) {
			System.out.println(ruolo);
		}
	}
	
	public Ruolo ricercaPerIdRuolo(int idRuolo) {
		for(Ruolo ruolo : listaRuoli) {
			if(ruolo.getIdRuolo() == idRuolo) {
				return ruolo;
			}
		}
			System.out.println("Nessuna corrispondenza trovata");
			return null;
		}
	
	public void createRuolo(Ruolo ruolo) {
		listaRuoli.add(ruolo);
		System.out.println("Ruolo inserito correttamente");
	}
	
	public void updateRuolo(Ruolo ruoloDaAggiornare) {
		boolean corrispondenzaTrovata = false;
		
		for(Ruolo ruolo : listaRuoli) {
			if(ruolo.getIdRuolo() == ruoloDaAggiornare.getIdRuolo()) {
				ruolo.setDescrizione(ruoloDaAggiornare.getDescrizione());
				corrispondenzaTrovata = true;
				System.out.println("Ruolo aggiornato correttamente");
				break;
			}
		}
		if(!corrispondenzaTrovata) {
			System.out.println("Nessuna corrispondenza trovata");
		}
	}
	
	public void deleteRuolo(int idRuolo) {
		boolean corrispondenzaTrovata = false;
		
		for(Ruolo ruolo : listaRuoli) {
			if(ruolo.getIdRuolo() == idRuolo) {
				listaRuoli.remove(ruolo);
				corrispondenzaTrovata = true;
				System.out.println("Ruolo eliminato correttamente");
				break;
			}
		}
		
		if(!corrispondenzaTrovata) {
			System.out.println("Nessuna corrispondenza trovata");
		}
	}
		
}
