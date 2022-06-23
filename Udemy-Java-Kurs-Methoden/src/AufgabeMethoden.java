
public class AufgabeMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Aufgabe:
		 * 
		 * 
		 * 1. Wert: 3.547
		 * 2. Wert: 6.354
		 * 
		 * Defieniere (erstelle) eine Methode die als Aufgabe hat, diese zwei Werte zu multiplizieren (mal nimmt)
		 * Diese Werte sollen dabei als Parameter an die Methode übergeben werden
		 * 
		 * Der Wert der errechnet wird soll dabei zurückgegeben werden, sodass wir den Wert in der Konsole ausgeben können.
		 * 
		 *  
		 */
		
		
		double a = summe();
		System.out.println(" Der Wert aus der Methode summ() ist : " + a);

	//	double summe = b - a;
		// System.out.println(" Der Wert in summe ist: " + a);
		
	}

	public static double summe() {
		double a, b, summe ;
		a = 3.547;
		b = 6.354;

		summe = a * b;
		
	
	
		return summe;
	}
	
}
