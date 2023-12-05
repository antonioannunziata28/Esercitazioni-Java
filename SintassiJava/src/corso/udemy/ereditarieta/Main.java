package corso.udemy.ereditarieta;

public class Main {

	public static void main(String[] args) {
		
		Leone leone = new Leone();
		//l'oggetto leone avrà tutti i metodi e attributi della classe padre, cioè Animale
		
		//Metodo di default ereditato dall'interfaccia Felino
		leone.miagola();
		
		//Metodo di tipo statico dell'interfaccia Felino
		Felino.mangia();
	}

}
