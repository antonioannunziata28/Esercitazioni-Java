package corso.udemy;

public class IstruzioneIf {

	public static void main(String[] args) {

		//se è vera una condizione fai questo altrimenti esegui quest'altro
		
		int x = 5;
		
		if(x > 0) {
			//condizione verificata
			
			System.out.println("La condizione è verificata");
		} else {
			System.out.println("Condizione non verificata");
		}
		
		//Oppure possiamo avere soltanto l'if 
		
		if(x > 0) {
			System.out.println("Solo codice if");
		}
		
		//Oppure possiamo avere diverse condizioni
		
		if(x > 0) {
			//blocco di codice
		}else if(x < 10) {
			//blocco di codice
		}else {
			//blocco di codice
		}
	}

}
