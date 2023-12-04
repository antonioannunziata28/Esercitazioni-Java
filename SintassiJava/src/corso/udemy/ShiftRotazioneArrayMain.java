package corso.udemy;

public class ShiftRotazioneArrayMain {

	public static void main(String[] args) {
		
		//Con l'operazione di shift l'ultimo elemento va perso, in ogni caso che sia a verso destra o sinistra
		
		int [] tmp = {3,4,6,8};
		
		//shift verso sinistra
//		for(int i = 0; i < tmp.length -1; i++) {
//			tmp[i] = tmp[i+1];
//		}
//		
//		//stampa
//		for(int i = 0; i < tmp.length; i++) {
//			System.out.println(tmp[i]);
//		}
//		
//		System.out.println("********************************");
//		System.out.println();
//		System.out.println("********************************");
//		
//		//shift verso destra
//		for(int i = tmp.length -1; i > 0; i--) {
//			tmp[i] = tmp[i-1];
//		}
//		
//		//stampa
//		for(int i = 0; i < tmp.length; i++) {
//			System.out.println(tmp[i]);
//		}
//		
//		System.out.println("********************************");
//		System.out.println();
//		System.out.println("********************************");
		
		//Con la rotazione invece l'ultimo termine, in entrambe le direzioni, non viene perso ma riassegnato
		
		
		//Rotazione verso sinistra
//		int first = tmp[0]; //Salviamo il primo elemento 
//		
//		for(int i = 0; i < tmp.length -1; i++) {
//			tmp[i] = tmp[i+1];
//		}
//		
//		tmp[tmp.length -1] = first; //Assegniamo il valore del primo termine al posto dell'ultimo termine
		
//		//stampa
//		for(int i = 0; i < tmp.length; i++) {
//			System.out.println(tmp[i]);
//			}
		
		//Rotazione verso destra
		
		int last = tmp[tmp.length -1]; //Salviamo l'ultimo elemento
		for(int i = tmp.length -1; i > 0; i--) {
			tmp[i] = tmp[i-1];
		}
		
		tmp[0] = last; //Assegniamo al primo termine il valore salvato in precedenza 
		
		//stampa
		for(int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ",");
		}
		
		
		
		
	}
}
