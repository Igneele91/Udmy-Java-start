
public class SchlüselwortIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kontrollstrukturen steuern den Programmablaufplan
		

		// if = falls
		// else = ansonsten
		
		
		
		
		int score = 4000;
		
		if (score == 5000)  // true ist    fals es nur 4000  ereicht dan zeigts nicht an  
		{
			System.out.println("Herzlichen Glückwunsch neuer Rekord!");
		}
		else
		{
			System.out.println("Schade dein Score reicht leider nicht!");  // Sobald es nicht erreicht ist kommt automatisch else hervor !!!!
		}
		
		int lebenPlayer = 0;
		
		if (lebenPlayer == 0)
		{
			System.out.println("Spiel Verloren");			
		}
		
		boolean gegnerHit = true;
		int highscore = 0;
		
		if (gegnerHit == false)
		{
			System.out.println("Gegner getroffen");
			highscore += 10;
			System.out.println("Highscore" + highscore);
		}
		else {
			System.out.println("Daneben");			
			 }
		
	}

}
