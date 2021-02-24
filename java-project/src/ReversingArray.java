import java.util.Scanner;

public class ReversingArray
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements: ");
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		
		System.out.println("Enter the elements one by one: ");
		
		int[] array = new int[c];
		for (int i = 0; i < c; i++)
		{
			array[i] = scan.nextInt();
		}
		
		System.out.print("The entered array: [");
		for (int x : array)
		{
			System.out.print(x + " ");
		}
		System.out.print("]");
		
		int t;
		
		for (int i = 0; i < c/2; i++)
		{
			t = array[i];
			array[i] = array[c-1-i];
			array[c-1-i] = t;
		}
		
		System.out.print("\nThe reversed array: [");
		for (int x : array)
		{
			System.out.print(x + " ");
		}
		System.out.print("]");
	}
}
