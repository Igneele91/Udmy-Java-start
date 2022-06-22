import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * for (Anfangswerte; Abbruchbedinungen; Zähler) {
		 *       }
		 * 
		 * 
		 * 
		 * while(Bedinungen)
		 *    { 
		 *   	Anweisungsblock
		 * 	  }                     Merke: Bedinung kann entweder true = wahr oder false = nicht wahr sein = while
		 *  
		 */
		
		 // wenn man genau weiss wie oft man die schleife durchlaufen lassen muss
//		for(int i = 1; i<=5; i++) {                   
//			System.out.println("Asteroid wurde erstellt Nr: " + i);
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Drücke 1 für Schwierigkeitsgrad leicht \n Drücke 2 für Schwierigkeitsgrad Mittel");
		
		scan.close();
		
		// wenn man nicht weiss wie oft man die schleife braucht 
		int userEingabe = scan.nextInt();
		int anzahlGegner = 0;
		
		if (userEingabe == 1) {
			anzahlGegner = 10;
		} else if (userEingabe == 2) {
			anzahlGegner = 15;
		}
		
		while(anzahlGegner != 0) {
			System.out.println(" Gegner erstellt! ");
			anzahlGegner --;
				
			}
		
		
		
		
		
		
		
		
	}

}
