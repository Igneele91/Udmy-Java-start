import java.util.Scanner;

public class testscani2 {

	public static void main(String[] args) {
		

		
		// Mit der Klasse Scannner hat man Methode zur Verfügung um Eingabe-Strömen (InputStream) einlesen
		// d.h. Werte einlesen wie z.B. Zahlen

				
				Scanner scanneres = new Scanner(System.in);    // System.in = Input = tastatur
			
				// Beispiele
				String name = scanneres.nextLine();
				char geschlecht = scanneres.next().charAt(0);        // gehe zur stelle 0 und das ist der erste buchstabe des einzelnen wortes
				int age = scanneres.nextInt();
				long mobileNumber = scanneres.nextLong();
				
				
				System.out.println("Name: " + name);
				System.out.println("Geschlecht: " + geschlecht);
				System.out.println("Age: " + age);
				System.out.println("Mobile Number: " + mobileNumber);
				
				scanneres.close();
				
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
