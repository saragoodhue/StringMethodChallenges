import java.util.Scanner;

public class verticalLetters
	{

		public static void main(String[] args)
			{
				System.out.println("Enter a word below:");
				Scanner userWord = new Scanner(System.in);
				String word = userWord.nextLine();

				for (int i = 0; i < word.length(); i++)
					{
						System.out.println(word.substring(i, i + 1));
					}

			}

	}
