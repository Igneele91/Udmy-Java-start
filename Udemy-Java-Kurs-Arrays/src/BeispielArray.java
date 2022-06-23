import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Array Deklaration
		// Datentyp [] Name = new Datentyp[Anzahl];
		 int[] lottoZahlen = new int[6];
		
		 // for (anfangswert; abbruchbedinungen; Zähler)
		 for(int i = 0; i< lottoZahlen.length; i++) {
			Scanner scan = new Scanner(System.in);
			int zahlUser = scan.nextInt();
			lottoZahlen[i] = zahlUser;
			 
		 }
		 
		 for(int i = 0; i< lottoZahlen.length; i++) {
			 System.out.println(lottoZahlen[i]);
		 }
		 
		 
		 
		// Merke: Index = Anzahl der Elemente -1
		// Index: hier  ist es:   0...5   = da es ja 6 felder hat immer das letzte -1
				 		 
		 
		 /*
		  * Array aufbau:
		  * 
		  * Platz 1 im Array = Index 0 =  Wert 10
		  * Platz 2 im Array = Index 1 =  Wert 10
		  * Platz 3 im Array = Index 2 =  Wert 10
		  * Platz 4 im Array = Index 3 =  Wert 10
		  * Platz 5 im Array = Index 4 =  Wert 10
		  * Platz 6 im Array = Index 5 =  Wert 10
		  * 
		  * da man die 0 auch mit zählt, darum nicht vergessen !!!
		  * 
		  */
		 
	}

}
