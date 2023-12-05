package corso.udemy.ereditarieta;


//Classe figlia, la classe Leone estende la classe Animale, ciò significa che erediterà tutti i metodi e gli 
//attributi della classe padre oltre che ad avere specifici attributi e metodi
public class Leone extends Animale implements Felino {

	public String luogoDiOrigine;

	//Metodo ereditato dall'interfaccia Felino;
	@Override
	public void ruggisci() {
		// TODO Auto-generated method stub
		
	}

	//Metodo astratto ereditato dalla classe astratta Animale, ora dovrà essere implementato
	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}
}
