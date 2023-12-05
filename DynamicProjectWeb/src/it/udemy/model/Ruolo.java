package it.udemy.model;

public class Ruolo {

	private int idRuolo;
	private String descrizione;
	
	
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Override
	public String toString() {
		return "Ruolo [idRuolo=" + idRuolo + ", descrizione=" + descrizione + "]";
	}
	
	
	
}
