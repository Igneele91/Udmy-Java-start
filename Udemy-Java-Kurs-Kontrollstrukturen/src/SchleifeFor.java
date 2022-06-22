
public class SchleifeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kontrollstrukturen steuern den Programmablaufplan
		
		// for = sei...
		
		/*
		 * Allgemeiner Aufbau einer for-Schleife
		 * 
		 * for (Anfangswerte; Abbruchbedinungen; Zähler)
		 * {
		 * system.out.println();
		 * }  
		 * 
		 */
		
		for (int i = 2; i<10; i++)    //   = aufbau einer for Schleife = (Anfangswerte; Abbruchbedinungen; Zähler erhötes um +1 ) 
		{          
			System.out.println(i);
		}
		
		
		for (int j = 1; j<=10; j++)
		{
		if (j == 5) {					
			System.out.println("Hey du hast mich gefunden" + j );
			}
		}
		
	}

}
