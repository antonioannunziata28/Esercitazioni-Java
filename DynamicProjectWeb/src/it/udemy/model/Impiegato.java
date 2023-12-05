package it.udemy.model;

public class Impiegato {

	private String codiceFiscale;
	private String nome;
	private String cognome;
	private int matricola;
	
	
	public Impiegato(String codiceFiscale, String nome, String cognome, int matricola) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}


	@Override
	public String toString() {
		return "Impiegato [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", matricola="
				+ matricola + "]";
	}
	
	
	
}
