import java.util.Scanner;

public class pigLatin
	{

		public static void main(String[] args)
			{
				System.out.println("Enter a phrase that you want to be translated into Pig Latin: ");
				Scanner userString = new Scanner(System.in);
				String pigString = userString.nextLine();

				String[] arrSplit = pigString.split(" ");

				for (int i = 0; i < arrSplit.length; i++)
					{
						switch (arrSplit[i].substring(0, 1))
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
								{
									// System.out.println(pigString.substring(1, pigString.length()) + "-way");
									System.out.print(
											arrSplit[i].substring(1) + "-" + arrSplit[i].substring(0, 1) + "way ");
									break;
								}
							default:
								{
									System.out.print(
											arrSplit[i].substring(1) + "-" + arrSplit[i].substring(0, 1) + "ay ");
								}

							}
					}

			}

	}
