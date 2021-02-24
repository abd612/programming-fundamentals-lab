import java.util.Scanner;

public class array
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[5];
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		System.out.println(arr1[0]);
		
		int[] arr2 = {2, 3, 5, 7};
		
		System.out.println(arr2[3]);
		
		int sum = 0;
		
		System.out.println(arr2.length);
		
		for (int i = 0; i < arr2.length; i++)
		{
			sum += arr2[i];
		}
		
		System.out.println("Sum is " + sum);
		
		String arr3[] = {"Zero", "One", "Two", "Three", "Four"};
		
		for (String c: arr3)
		{
			System.out.println(c);
		}
		
		Scanner var = new Scanner(System.in);
		
		System.out.print("Enter length of array: ");
		int length = var.nextInt();
		
		char[] arr4 = new char[length];
		
		for (int j = 0; j < length; j++)
		{
			arr4[j] = var.next().charAt(0);
		}
		for (char x: arr4)
		{
			System.out.println(x);
		}
		
		double[][] arr5 = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};
		
		for (int m = 0; m < 2; m++)
		{
			for (int n = 0; n < 3; n++)
			{
				System.out.print(arr5[m][n] + " ");
			}
			
			System.out.println("");
		}
	}
}