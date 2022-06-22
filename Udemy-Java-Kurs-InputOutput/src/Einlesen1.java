import java.util.Scanner;

public class Einlesen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Klasse = Komplexer Datentyp sprich dort sind mehr als nur eine Information gespeichert
		
	
		Scanner scan = new Scanner(System.in);           // interaktion mit der Konsole zum sachen eingeben.  =    new Scanner erstellt ein neues objekt Hinweis!
		System.out.println(" Bitte eine Zahl eintippen ...... " );
		double zahl = scan.nextDouble();                           // und das neue erstellte Object ist ein Double was wir angezeigt haben wollen
		System.out.println(" Ihre Zahl lautet: " + zahl );
		
		/* mit dem Punkt . geht man in das Object hinein und es wird halt nur eine Information ab, 
		 * ob es jetzt ein Wert = double oder string = Name ist muss angegeben werden beim scan new = gemeint 
		 * 
		 * achtung auch achten auf (system in) wo man es ausgegeben haben will
		 * 
		 */
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println(" Geben Sie Ihren Namen ein: ");
		String zeichenkette = scan2.next();
		System.out.println(" Bitte geben Sie ihr Alter ein: ");
		int alter = scan2.nextInt();
		
		System.out.println(" Ihre Name: " + zeichenkette + " Ihr Alter: " + alter);
		
	}

}
