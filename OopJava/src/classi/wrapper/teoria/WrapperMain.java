package classi.wrapper.teoria;

public class WrapperMain {

	//Per ogni tipo di dato primitivo esiste una classe corrispondente detta wrapper, il cui nome si ottiene
	//scrivendo con prima lettera maiuscola il dato primitivo corrispondente
	
	//Una classe wrapper ha lo scopo di contenere un dato primitivo trasformandolo in un oggetto
	
	public static void main(String[] args) {
		
		//Creiamo una classe wrapper
		Integer integer = new Integer(2);
		//Oppure
		Integer integer1 = 34;
		
		//Possiamo avere un array di classi wrapper
		Integer[] arrayWrap = new Integer[5]; //In questo caso l'array ha 5 posizioni 
		
		//Ad esempio se abbiamo un array di classi wrapper possiamo capire se quell'array è valorizzato o meno
		//essendo equiparabile ad un array di oggetti, si applicheranno le stesse condizioni, per cui se l'indice
		//non è valorizzato al suo interno ci sarà null
		if(arrayWrap[0] == null) {
			arrayWrap[0] = integer1; //In questo modo abbiamo valorizzato l'indice 0
		}
		
		//Un'altra peculiarità delle classi wrapper è quella di fornire molteplici metodi associati
		//a quel tipo di dato primitivo specifico
		
		//Ad esempio se vogliamo trasformare una stringa in intero
		int value = Integer.parseInt("14"); //In questo modo "14" come stringa verrà trasf. in intero
		
		//I wrapper possono essere trasformati nel corrispondente tipo primitivo e viceversa
		int valorePrimitivo = new Integer(2); // da Integer a int
		Integer integer3 = valorePrimitivo; //da int a Integer
		
		
		

	}

}
