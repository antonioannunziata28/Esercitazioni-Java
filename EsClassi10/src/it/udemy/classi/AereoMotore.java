package it.udemy.classi;

public class AereoMotore extends Aeromobile {

	
	private int potenza;
	
	
	public AereoMotore(String sigla, int potenza) {
		super(sigla);
		this.potenza = potenza;
	}


	@Override
	public int compareTo(Aeromobile other) {
		if(other instanceof AereoMotore) {
			AereoMotore otherAereoMotore = (AereoMotore) other;
			return Double.compare(this.potenza, otherAereoMotore.potenza);
		} else {
			return -1;
		}
	}


	public int getPotenza() {
		return potenza;
	}


	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}
	
	

}
