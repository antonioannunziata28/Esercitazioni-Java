package corso.udemy;

public class ArrayMain {

	public static void main(String[] args) {

		int[] e = new int[2];
		
		int[] f = new int[40];
		
		float[] tmp = new float[30];
		
		// oppure
		
		int c[] = new int[40];
		
		//creazione e popolamento
		
		int [] prova = {1,4,6,33,53};
		
		//Gli array hanno dimensione fissa, cioè dal momento della creazione non possiamo piu' inserire celle
		//in aggiunta a quelle create in precedenza. Cioè sei un array quando è stato creato è stato dichiarato
		//con 6 celle, successivamente non sarà possibile aggiungere una nuova celle
		
		//Per stampare un array ci sono diversi modi
		
		System.out.println(prova[1]);
		
		//oppure nel caso in cui abbiamo la necessità di stampare magari tutti i valori dell'array
		
		for(int i = 0; i < prova.length; i++){
			System.out.println(prova[i]);
		}
	}

}
