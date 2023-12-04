package it.udemy.main;

import it.udemy.operation.Campionato;
import it.udemy.operation.Partita;
import it.udemy.operation.Squadra;

public class Main {

	public static void main(String[] args) {
//		PROGGETTARE UN APPLICAZIONE PER LA GESTIONE DI SQUADRE E GIOCATORI DI UN CAMPIONATO DI CALCIO.
//		I GIOCATORI SONO CARATTERIZZATI DA UN NOME ED UN ANNO DI NASCITA. LE SQUADRE SONO CARATTERIZZATE
//		DA UN NOME. IN UNA SQUADRA GIOCANO ALMENO 15 GIOCATORI. TRA I GIOCATORI CHE GIOCANO IN UNA SQUADRA
//		UNO SOLO GIOCA NEL RUOLO DI CAPITANO. LE SQUADRE SI INCONTRANO TRA DI LORO IN PARTITE, DI CUI CI
//		INTERESSA CONOSCERE QUALE SQUADRA GIOCA IN CASA E QUALE IN TRASFERTA, ED IL RISULTATO. 
//		DATA UNA SQUADRA SI VUOLE CONOSCERE LE SQUADRE CON CUI SI E' INCONTRATA, SIA IN CASA CHE NON

		//Apriamo il campionato e gli diamo un nome
		Campionato campionato = new Campionato();
		campionato.setNomeCampionato("Calcio 21-22");
		
		//Creiamo una partita
		Partita p1 = new Partita();
		
		//Creiamo una squadra, gli diamo un nome e indichiamo che ha giocato in casa
		Squadra s1 = new Squadra();
		s1.setNome("Napoli");
		p1.setSquadraCasa(s1);
		
		//Creiamo un'altra squadra, gli diamo un nome e indichiamo che ha giocato in trasferta
		Squadra s2 = new Squadra();
		s2.setNome("Udinese");
		p1.setSquadraTrasferta(s2);
		
		//Aggiungiamo la partita alla lista delle partite contenuta nella classe campionato
		campionato.getPartite().add(p1);
		
		//Creiamo diverse partite a questo punto 
		Partita p2 = new Partita();
		
		Squadra s3 = new Squadra();
		s3.setNome("Milan");
		p2.setSquadraCasa(s3);
		
		Squadra s4 = new Squadra();
		s4.setNome("Inter");
		p2.setSquadraTrasferta(s4);
		
		campionato.getPartite().add(p2);
		
		Partita p3 = new Partita();
		
		Squadra s5 = new Squadra();
		s5.setNome("Juventus");
		p3.setSquadraCasa(s5);
		
		Squadra s6 = new Squadra();
		s6.setNome("Chievo-Verona");
		p3.setSquadraTrasferta(s6);
		
		campionato.getPartite().add(p3);
		
		campionato.infoSquadra(s1);
		campionato.infoSquadra(s2);
		
	}

}
