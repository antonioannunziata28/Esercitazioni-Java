package it.udemy.classi;

import java.util.ArrayList;
import java.util.List;

public class Progetto {

	private String nome;
	private int budget;
	private String citta;
	private List<Impiegato> partecipanti = new ArrayList<Impiegato>();
	
	public Progetto(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public List<Impiegato> getPartecipanti() {
		return partecipanti;
	}
	public void setPartecipanti(List<Impiegato> partecipanti) {
		this.partecipanti = partecipanti;
	}



	@Override
	public String toString() {
		return "Progetto [nome=" + nome + ", budget=" + budget + ", citta=" + citta + ", partecipanti=" + partecipanti
				+ "]";
	}
}
