 import java.text.DecimalFormat;
import java.util.Scanner;
public class assignment1submit {
	public static void main (String [] args) {

		String choice;
		String newWord = "";
		String word="";
		double azerothAge = 0;
		DecimalFormat df2 = new DecimalFormat (". #");
		Scanner msPacman = new Scanner (System.in);
			
		do {	
			System.out.println ( "*************************");
			System.out.println ("*** WELCOME ***");
			System.out.println ( "*************************");
			System.out.println ("1. Show language capabilities");
			System.out.println ("2. Shom mathmatical capabilities");
			System.out.println ("3. Self-destruct");
			choice = msPacman.nextLine ();
			
			
				
			if (choice.equals("1")) {
					System.out.println ( "*************************");
					System.out.println ("Enter a word:");
					System.out.println ( "*************************"); 
					
					word = msPacman.nextLine ();
					
					while (!word.equalsIgnoreCase("quit") || word.equalsIgnoreCase("bye") || word.equalsIgnoreCase("exit"));
					newWord = word.replaceAll("\\s", "");
					int middleMost = newWord.length()/2;

					newWord = newWord.substring(middleMost) + newWord.substring(0, middleMost);
					System.out.println("The word you have entered evaluates to " + newWord );

				
			if (choice.equals("2")) {
				System.out.println("Enter your age in years: ");
				System.out.println("*************************");

				double age;
				age = msPacman.nextInt();
				System.out.println("*************************");

				double earthAge= (age * 365);
				System.out.println("On Earth you lived "+ earthAge+" days");

				
				azerothAge = (earthAge/243); 
				System.out.println("On Azeroth, you are "+  (int)(azerothAge) + " years old");  


				double lifeExpectancy= (azerothAge * (0.1)*243);
				System.out.println("The toxic atmosphere here will kill you in: "+ lifeExpectancy + " days.");
				System.out.println("*************************");
			} else if (choice.equals("3")) {  
				System.out.println("*************************");
				System.out.println("Civilization Intelligence Level " + (newWord + (df2.format(azerothAge))));
				System.out.println("Status : Unworthy");
				System.out.println("*************************");
				   
			}
			
		
		
		
	}
		}while (!choice.equals("3"));
	}}





