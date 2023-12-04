package corso.udemy;

public class EsArray1 {

	public static void main(String[] args) {
		
//		Scrivere un programma per invertire un array di valori interi

		int [] r = {20, 10, 5, 4, 3, 2, 1};
		
		for(int i = 0; i < r.length; i++) {
			System.out.print(r[i] + ",");
		}
		System.out.println();
		System.out.println();
		System.out.println("Scrivere un programma per invertire un array di valori interi");
		System.out.println();
		
		int index = r.length -1;
		
		for (int i = 0; i <= r.length/2; i++) {
			int tmp = r[i];
			r[i] = r[index];
			r[index] = tmp;
			index--;
		}
		
		for(int k = 0; k < r.length; k++) {
			System.out.print(r[k] + ",");
		}
	}

}
