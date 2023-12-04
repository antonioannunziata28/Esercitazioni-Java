package it.udemy.gestionale;

import java.util.ArrayList;
import java.util.List;

import it.udemy.classi.Dipartimento;
import it.udemy.classi.Impiegato;
import it.udemy.classi.Progetto;

public class Gestionale {

	private List<Impiegato> impiegati = new ArrayList<>();
	private List<Dipartimento> dipartimenti = new ArrayList<>();
	private List<Progetto> progetti = new ArrayList<>();
	
	public void aggiungiImpiegato(Impiegato impiegato) {
		impiegati.add(impiegato);
	}
	
	public void eliminaImpiegato(String codiceFiscale) {
		
		for(Impiegato impiegato : impiegati) {
			if(impiegato.getCf().equals(codiceFiscale)){
				impiegati.remove(impiegato);
				break;
			}
		}
	}
	
	public void aggiungiProgetto(Progetto progetto) {
		progetti.add(progetto);
	}
	
	public void associaImpiegatoProgetto(Impiegato impiegato, Progetto progetto) {
		for (Progetto prog : progetti) {
			if(prog.getNome().equals(progetto.getNome())) {
				prog.getPartecipanti().add(impiegato);
			}
		}
	}
	
	public void aggiungiDipartimento(Dipartimento dipartimento) {
		dipartimenti.add(dipartimento);
	}
	
	public void associaImpiegatoDipartimento(Dipartimento dipartimento, Impiegato impiegato) {
		for (Dipartimento dip : dipartimenti) {
			if(dip.getNome().equals(dipartimento.getNome())) {
				dip.getImpiegati().add(impiegato);
			}
		}
	}

	@Override
	public String toString() {
		return "Gestionale [impiegati=" + impiegati + ", dipartimenti=" + dipartimenti + ", progetti=" + progetti + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
