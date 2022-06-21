
public class Operatoren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Die Vergleich Operatoren werden oft im Zusammenhang mit 
		 * if else Konstruktionen verwendet
		 * Beispiel:
		 * 
		 * (if Bedinung) {
		 * 
		 * Wenn die Bedinung true = also gleich wahr ist dann wird alles zwischen
		 * { ausgeführt}
		 * 
		 * }
		 * 
		 */
		
		// if = zu Deutsch falls
		// else ansonsten
		
		int lebenGegner = 50;
		boolean hit = false;
		
		int a = 3;
		int b = 3;
		boolean c;  // 1.true 2.false
		
		
		
		
		c = a < b;
		System.out.println("Nr 2 ist gleich = " + c);       // logisches Und Operatoren = && )
		
		if (lebenGegner == 0 || hit == true)  // (true) oder (false)      (logisches Oder Operatoren = ||  )
			{
			System.out.println(" Gegner zerstört ");
			}
		
		else{
			System.out.println(" Gegner hat noch: " + lebenGegner + "Punkte");
			}
		
		
		/*
		c = a == b;
		System.out.println( "Nr 1 ist gleich = " + c);
		*/
		
		
		/*
		  c = a > b;
		  System.out.println("Nr 3 ist gleich = " + c);
		*/
		
		
		
	}

}
