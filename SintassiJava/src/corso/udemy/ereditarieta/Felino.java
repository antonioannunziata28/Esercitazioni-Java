package corso.udemy.ereditarieta;

//In java non esiste l'ereditarietà multipla, quindi una classe può estendere una sola classe. Allora ci vengono
//in aiuto le interfacce, possono contenere solo metodi astratti senza corpo, saranno poi implementati nella 
//classe che utilizzerà l'interfaccia. In questo modo possiamo fornire ad una classe metodi appartenenti a diverse
//interfaccie ovviando al limite di ereditarieta singola

public interface Felino {

	void ruggisci();
	
	//Le variabili nelle interfaccie devono essere dichiarate ed inizializzate, in quanto le variabili nelle interfaccie
	//sono solo di tipo final
	public int count = 23;
	
	
	//Da java 1.8 possiamo utilizzare anche dei metodi già pronti, metodi detti di default o metodi statici,
	//con un corpo, dove la classe che utilizzerà l'interfaccia può utilizzare il metodo o effettuarne l'override
	
	default void miagola() {
		System.out.println("Miao");
	}
	
	static void mangia() {
		System.out.println("sto mangiando");
	}
}
