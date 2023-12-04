package it.udemy.operation;

import java.util.List;

public class Squadra {

	private String nome;
	private List<Giocatori> giocatori;

	
	public List<Giocatori> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatori> giocatori) {
		this.giocatori = giocatori;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
