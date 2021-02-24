import java.util.Scanner;

public class LargerTwo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three positive numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("Greater two numbers are: " + Math.max(a, Math.max(b, c)) + " and " + Math.max(Math.min(a, b),Math.max(Math.min(b,c),Math.min(c, a))));
	}
}
