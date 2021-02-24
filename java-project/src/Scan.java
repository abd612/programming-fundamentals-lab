import java.util.Scanner;

public class Scan
{
	public static void main (String [] args)
	{
		Scanner var = new Scanner (System.in);
		
		System.out.println ("Please enter your name:");
		String name = var.nextLine ();
		
		System.out.println ("Please enter your registration number:");
		String regd = var.nextLine ();
		
		System.out.println ("Please enter your department:");
		String dept = var.nextLine ();
		
		System.out.println ("Please enter your session:");
		int ses = var.nextInt ();
		
		System.out.println ("Please enter your section:");
		String sec = var.next ();
		
		System.out.println ("Your Credentials!");
		System.out.println ("Name: " + name + ", Regd. No: " + regd + ", Department: " + dept + ", Session: " + ses + ", Section: " + sec);
	}
}
