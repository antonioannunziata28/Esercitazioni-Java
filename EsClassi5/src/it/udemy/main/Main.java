package it.udemy.main;

import it.udemy.classi.Dipartimento;
import it.udemy.classi.Impiegato;
import it.udemy.classi.Progetto;
import it.udemy.gestionale.Gestionale;

public class Main {

	public static void main(String[] args) {
//		CREARE UN GESTIONALE PER GLI IMPIEGATI ED I PROGETTI DI UN AZIENDA. DEGLI IMPIEGATI INTERESSA
//		IL CODICE FISCALE, IL NOME, IL COGNOME, I DIPARTIMENTI A CUI APPARTENGONO ED I PROGETTI AI QUALI
//		PARTECIPANO. UN IMPIEGATO PUO APPARTENERE A UNO O PIU DIPARTIMENTI. DEI PROGETTI INTERESSA IL NOME
//		IL BUDGET E LA CITTA IN CUI VENGONO SVOLTI (SE STABILITA). IL NOME DI UN PROGETTO NON PUO ESSERE
//		CAMBIATO. DEI DIPARTIMENTI INTERESSA IL NOME, IL NUMERO DI TELEFONO, L'IMPIEGATO CHE LO DIRIGE
//		(SE PRESENTE) E LA CITTA DOVE E' LOCALIZZATA LA SEDE. DELLE CITTA INTERESSA IL NOME E LA REGIONE.
//		CREARE TUTTE LE OPERAZIONI NECESSARIE PER IL CORRETTO UTILIZZO DEL GESTIONALE, QUINDI TUTTI I CRUD
//		PER IMPIEGATO, PROGETTO E DIPARTIMENTO CON LE RICERCHE CHE SI RITIENE OPPORTUNE

		
		Gestionale gestionale = new Gestionale();
		
		Impiegato impiegato = new Impiegato();
		impiegato.setCf("CRLMEN");
		
		gestionale.aggiungiImpiegato(impiegato);
		
		Progetto progetto = new Progetto("Progetto prova");
		gestionale.aggiungiProgetto(progetto);
		
		Impiegato impiegatoF = new Impiegato();
		impiegatoF.setCf("FFFFF");
		gestionale.associaImpiegatoProgetto(impiegatoF, progetto);
		
		System.out.println(gestionale.toString());
		
		Dipartimento dipartimento1 = new Dipartimento();
		dipartimento1.setNome("Prova dipartimento");
		gestionale.aggiungiDipartimento(dipartimento1);
		gestionale.associaImpiegatoDipartimento(dipartimento1, impiegatoF);
		System.out.println(gestionale.toString());
		
		gestionale.eliminaImpiegato(impiegatoF.getCf());
		System.out.println(gestionale.toString());
		
		
	}

}
