package corso.udemy;

public class EsCicliMain {

	public static void main(String[] args) {
		
		System.out.println("Scrivi i numeri da 1 a 100");
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ",");
			
			}
		System.out.println();	
		System.out.println("Questi sono quelli divisibili per 5");
		
		for (int j = 1; j <= 100; j++) {
			if(j % 5 == 0) {
				System.out.print(j + ",");
			}
		}
		System.out.println();
		System.out.println("Questi sono quelli divisibili per 3");
		
		for (int k = 1; k <= 100; k++) {
			if(k % 3 == 0) {
				System.out.print(k + ",");
			}
		}
		
		System.out.println();
		System.out.println("Questi sono quelli divisibili per 3 e per 5");
		
		for (int l = 1; l <= 100; l++) {
			if(l % 3 == 0 && l % 5 == 0) {
				System.out.print(l + ",");
			}
		}
	}
}
