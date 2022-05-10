import java.util.Scanner;

public class pigLatinTry
	{

		public static void main(String[] args)
			{
				System.out.println("Enter a phrase that you want to be translated into Pig Latin: ");
				Scanner userString = new Scanner(System.in);
				String pigString = userString.nextLine();
				
				System.out.println(pigString.substring(1, pigString.length()) + "-" + pigString.substring(0,1) + "ay");

			}

	}
