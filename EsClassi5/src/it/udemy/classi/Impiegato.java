package it.udemy.classi;

public class Impiegato {

	private String cf;
	private String nome;
	private String cognome;
	

	public String getCf() {
		return cf;
	}


	public void setCf(String cf) {
		this.cf = cf;
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


	@Override
	public String toString() {
		return "Impiegato [cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}
