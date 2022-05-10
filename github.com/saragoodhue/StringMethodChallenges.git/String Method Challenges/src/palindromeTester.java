import java.util.Scanner;

public class palindromeTester
	{

		public static void main(String[] args)
			{
				System.out.println("Test out if your word/phrase is a palindrome! Enter it below:");
				Scanner userPal = new Scanner(System.in);
				String palindrome = userPal.nextLine();

				StringBuffer test = new StringBuffer(palindrome);
				test = test.reverse();
				System.out.println(test);
				
				palindrome = palindrome.replace(" ", "");
				
				if (test.reverse().toString().equals(palindrome))
					{
						System.out.println("What you entered is a palindrome!");
					}

				else
					{
						System.out.println("What you entered is not a palindrome.");
					}

			}

	}
