import java.util.Scanner;

public class switches
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter your section: ");
		Scanner var = new Scanner(System.in);
		char sec = var.next().charAt(0);
		
		switch (sec)
		{
			case 'a':
			case 'A':
				System.out.println("Section A");
				break;
				
			case 'b':
			case 'B':
				System.out.println("Section B");
				break;
				
			case 'c':
			case 'C':
				System.out.println("Section C");
				break;
				
			case 'd':
			case 'D':
				System.out.println("Section D");
				break;
				
			default:
				System.out.println("Unregistered");
		}
	}
}