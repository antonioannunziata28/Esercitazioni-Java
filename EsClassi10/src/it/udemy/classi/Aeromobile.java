package it.udemy.classi;

public abstract class Aeromobile implements Comparable<Aeromobile> {

	private String sigla;
	
	public Aeromobile(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public abstract int compareTo(Aeromobile other);

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	
}
