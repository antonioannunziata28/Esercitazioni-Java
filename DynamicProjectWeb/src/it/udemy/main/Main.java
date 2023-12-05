package it.udemy.main;

import it.udemy.dao.ImpiegatoDao;
import it.udemy.dao.RuoloDao;
import it.udemy.model.Impiegato;
import it.udemy.model.Ruolo;

public class Main {

	public static void main(String[] args) {
//		Creare un dynamic project web,
//		
//		Creare un package chiamato model
//		Creare una classe chiamata Impiegato
//		Creare un package chiamato dao
//		Creare una classe ImpiegatoDao
//		
//		Nella classe ImpiegatoDao, aggiungere un arraylist di tipo Impiegato, chiamato listaImpiegato
//		
//		Nella classe ImpiegatoDao, aggiungere i seguenti metodi:
//			-ricercaPerCodiceFiscale, prende in ingresso un codice fiscale e cerca un impiegato, dentro listaImpiegato
//				ritorna l'impiegato o altrimenti null
			
//			-inserisci, prende in ingresso un'istanza i di impiegato e l'aggiunge alla listaImpiegato
//			
//			-aggiorna, prende in ingresso un'istanza i di Impiegato, la cerca tramite codice fiscale e se lo trova
//				aggiorna il contenuto con l'istanza i. Ritorna true se l'istanza è stata trovata
//			
//			- elimina, prende in ingresso un codice fiscale e cerca dentro listaImpiegato. Se lo trova lo elimina

		Impiegato antonio = new Impiegato("NNNTN", "Antonio", "Annunziata", 28);
		Impiegato giuseppe = new Impiegato("GPPN", "Giuseppe", "Rossi", 18);
		Impiegato raffaele = new Impiegato("RFDCS", "Raffaele", "Verdi", 15);
		
		ImpiegatoDao dao = new ImpiegatoDao();
		dao.createImpiegato(antonio);
		dao.createImpiegato(raffaele);
		dao.createImpiegato(giuseppe);
		
		dao.readAllList();
		
		Impiegato res = dao.ricercaPerCodiceFiscale("NNNTN");
		System.out.println(res);
		
		Impiegato raffaele2 = new Impiegato("RFDCS", "Raffaele", "Ramiro", 21);
		dao.updateImpiegato(raffaele2);
		System.out.println(raffaele2);
		
		dao.deleteImpiegato(raffaele2);
		dao.ricercaPerCodiceFiscale("RFDCS");
		
		dao.readAllList();
		
		Ruolo developer = new Ruolo();
		developer.setDescrizione("Sviluppatore");
		developer.setIdRuolo(1);
		
		Ruolo pO = new Ruolo();
		pO.setDescrizione("Product owner");
		pO.setIdRuolo(2);
		
		Ruolo sMaster = new Ruolo();
		sMaster.setDescrizione("Scrum master");
		sMaster.setIdRuolo(3);
		
		RuoloDao ruoloDao = new RuoloDao();
		ruoloDao.createRuolo(developer);
		ruoloDao.createRuolo(sMaster);
		ruoloDao.createRuolo(pO);
		
		ruoloDao.readAllRole();
		
		System.out.println(ruoloDao.ricercaPerIdRuolo(1));
		
		pO.setDescrizione("Product Owner Aggiornato");
		ruoloDao.updateRuolo(pO);
		System.out.println(ruoloDao.ricercaPerIdRuolo(2));
		
		ruoloDao.deleteRuolo(2);
		ruoloDao.readAllRole();
		
		
	}

}
