import java.util.Scanner;

public class Vowels
{
	public static void main(String[] main)
	{
		System.out.println("Enter a string: ");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int a = 0, e = 0, i = 0, o = 0, u = 0, l = 0;
		
		for (int c = 0; c < input.length(); c++)
		{
			switch (input.charAt(c))
			{
				case 'A':
				case 'a':
					a++;
					break;
					
				case 'E':
				case 'e':
					e++;
					break;
					
				case 'I':
				case 'i':
					i++;
					break;
					
				case 'O':
				case 'o':
					o++;
					break;
					
				case 'U':
				case 'u':
					u++;
					break;
					
				default:
					l++;
					break;
			}
		}
		
		System.out.println("No. of As: " + a);
		System.out.println("No. of Es: " + e);
		System.out.println("No. of Is: " + i);
		System.out.println("No. of Os: " + o);
		System.out.println("No. of Us: " + u);
		System.out.println("Total vowels: " + (a + e + i + o + u));
		System.out.println("Leftover characters: " + l);
	}
}
