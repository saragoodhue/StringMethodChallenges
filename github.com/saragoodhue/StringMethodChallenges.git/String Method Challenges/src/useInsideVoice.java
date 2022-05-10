import java.util.Scanner;

public class useInsideVoice
	{

		public static void main(String[] args)
			{
				System.out.println("Enter a word in all caps below:");
				Scanner userWord = new Scanner(System.in);
				String word = userWord.nextLine();
				
				System.out.println(word.substring(0,1) + word.substring(1).toLowerCase());

			}

	}
