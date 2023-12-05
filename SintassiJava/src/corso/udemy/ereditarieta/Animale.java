package corso.udemy.ereditarieta;

//Classe padre, rappresenterà la macrocategoria delle classi figlie cui erediteranno attributi e metodi

//Se non abbiamo necessità che questa classe sia istanziabile possiamo renderla astratta, in questo modo
//la classe Animale non sarà instanziabile ma le classi che la estenderanno continueranno ad ereditare
//sia attributi che metodi

public abstract class Animale {

	//A differenza delle interfaccie possiamo avere degli attributi non inizializzati
	public int peso;
	public String razza;
	public int numeroDiZampe;
	
	//Inoltre abbiamo la possibilità di creare dei metodi astratti, come nelle interfacce non avranno corpo ma le
	//classi che estenderanno questa classe dovranno implementare quei metodi
	
	public abstract int getPeso();
}
