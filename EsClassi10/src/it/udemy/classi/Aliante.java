package it.udemy.classi;

public class Aliante extends Aeromobile {

	private int effAerodinamica;
	
	public Aliante(String sigla, int effAerodinamica) {
		super(sigla);
		this.effAerodinamica = effAerodinamica;
	}

	@Override
	public int compareTo(Aeromobile other) {
		if(other instanceof Aliante) {
			Aliante otherAliante = (Aliante) other;
			return Integer.compare(this.effAerodinamica, otherAliante.effAerodinamica);
		} else {
			return 1;
		}
		
	}

	public int getEffAerodinamica() {
		return effAerodinamica;
	}

	public void setEffAerodinamica(int effAerodinamica) {
		this.effAerodinamica = effAerodinamica;
	}
	
	

}
