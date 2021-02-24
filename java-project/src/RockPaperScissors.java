import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("** Welcome to a game of Rock/Paper/Scissors **");
		System.out.print("Enter the number of sets: ");
		
		int j = scan.nextInt();
		
		int w = 0, l = 0, t = 0;
		
		for (int i = 0; i < j; i++)
		{
			System.out.println("\nChoose your item: ");
			String user = scan.next();
			
			int n = rand.nextInt(3);
			
			String comp;
			
			switch (n)
			{
				case 0:
					comp = "rock";
					break;
					
				case 1:
					comp = "paper";
					break;
					
				case 2:
					comp = "scissors";
					break;
					
				default:
					comp = "null";
					break;
			}
			
			if (user.equals("rock") && comp.equals("rock"))
			{
				t++;
				System.out.println("rock v rock: tie");
			}
			
			else if (user.equals("rock") && comp.equals("paper"))
			{
				l++;
				System.out.println("rock v paper: loss");
			}
			
			else if (user.equals("rock") && comp.equals("scissors"))
			{
				w++;
				System.out.println("rock v scissors: win");
			}
			
			else if (user.equals("paper") && comp.equals("rock"))
			{
				w++;
				System.out.println("paper v rock: win");
			}
			
			else if (user.equals("paper") && comp.equals("paper"))
			{
				t++;
				System.out.println("paper v paper: tie");
			}
			
			else if (user.equals("paper") && comp.equals("scissors"))
			{
				l++;
				System.out.println("paper v scissors: loss");
			}
			
			else if (user.equals("scissors") && comp.equals("rock"))
			{
				l++;
				System.out.println("scissors v rock: loss");
			}
			
			else if (user.equals("scissors") && comp.equals("paper"))
			{
				w++;
				System.out.println("scissors v paper: win");
			}
			
			else if (user.equals("scissors") && comp.equals("scissors"))
			{
				t++;
				System.out.println("scissors v scissors: tie");
			}
		}
		
		System.out.println("\nwins: " + w);
		System.out.println("losses: " + l);
		System.out.println("ties: " + t);
		
		if (w > l)
			System.out.println("\nyou win!");
		
		if (w < l)
			System.out.println("\nyou lose!");
		
		if (w == l)
			System.out.println("\nit's a tie");
	}
}
