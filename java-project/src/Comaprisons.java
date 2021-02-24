import java.util.Scanner;

public class Comaprisons
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three strings: ");
		String val1 = scan.nextLine();
		String val2 = scan.nextLine();
		String val3 = scan.nextLine();
		
		System.out.println("The largest is: " + Compare3.largest(val1, val2, val3));
		
		System.out.println("Enter three integers: ");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int value3 = scan.nextInt();
		
		System.out.println("The largest integer is: " + Compare3.largest(value1, value2, value3));
	}
}
