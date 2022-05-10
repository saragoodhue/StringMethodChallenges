import java.util.Scanner;
public class countVowels
	{

		public static void main(String[] args)
			{
				System.out.println("Enter a sentence and I will tell you how many vowels are in the word");
				Scanner userWord = new Scanner(System.in);
				String sentence = userWord.nextLine();
				
				int counter = 0;
				
				
				
				for (int i = 0; i < sentence.length(); i++) {
					String letter = sentence.substring(i, i + 1);
					switch (letter)
				{
					case "a":
					case "e":
					case "i":
					case "o":
					case "u":
					case "A":
					case "E":
					case "I":
					case "O":
					case "U":
						counter ++;
						
						break;
						
				}
				
				}
				System.out.println("The number of vowels in your sentence is: " + counter);

		}
	}
