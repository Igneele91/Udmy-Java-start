import java.util.Scanner;

public class testscani {                   // ist nur Zusatz übung

	public static void main(String[] args) {
		
		// Mit der Klasse Scannner hat man Methode zur Verfügung um Eingabe-Strömen (InputStream) einlesen
		// d.h. Werte einlesen wie z.B. Zahlen

		
		Scanner scanner = new Scanner(System.in);    // System.in = Input = tastatur
		
		int zahli  = scanner.nextInt();
				
		System.out.println(zahli);
		
		scanner.close();   // und die eingabe wieder schliessen  = immer so ein close rein tun
		
		
		/*
		 * 
		 * System.out.println(" Gib eine Zahl ein: " + reintippen);
		 * String reintippen = scanner.next();
		 */
		
		
		// Was kann einglesen werden ?
		
		// nextInt()     -    Int
		// nextFloat()   -    Float
		// nextDouble()  -    Double
		// nextLong()    -    Long
		// nextShort()   -    Short
		// next()        -    Einzelnes Wort
		// nextLine()    -    String "Zeichenkette"
		//nextBoolean()  -    Boolean
		
		
	}

}
