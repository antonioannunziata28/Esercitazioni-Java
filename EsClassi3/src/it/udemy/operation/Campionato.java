package it.udemy.operation;

import java.util.ArrayList;
import java.util.List;

public class Campionato {

	private String nomeCampionato;
	private List<Squadra> squadre;
	private List<Partita> partite = new ArrayList<Partita>();
	
	
	public void infoSquadra(Squadra squadra) {
		
		for (Partita partita : partite) {
			if(partita.getSquadraCasa().getNome().equals(squadra.getNome())) {
				System.out.println(squadra.getNome() + "-" + partita.getSquadraTrasferta().getNome() + " giocata in casa");
				
			}
			if(partita.getSquadraTrasferta().getNome().equals(squadra.getNome())) {
				System.out.println(partita.getSquadraCasa().getNome() + "-" + squadra.getNome() + " giocata in trasferta");
				
			}
		}
	}


	public String getNomeCampionato() {
		return nomeCampionato;
	}


	public void setNomeCampionato(String nomeCampionato) {
		this.nomeCampionato = nomeCampionato;
	}


	public List<Squadra> getSquadre() {
		return squadre;
	}


	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}


	public List<Partita> getPartite() {
		return partite;
	}


	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}
	
	
}
