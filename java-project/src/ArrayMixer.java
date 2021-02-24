//Coded by: Muhammad Abdullah
//(2015-EE-166)

import java.util.Scanner;

public class ArrayMixer
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of array A: ");
		int M = scan.nextInt();
		int[] A = new int[M];
		
		System.out.println("Enter elements of array A: ");
		for (int i = 0; i < M; i++)
			A[i] = scan.nextInt();
		
		System.out.println("Enter the length of array B: ");
		int N = scan.nextInt();
		int[] B = new int[N];
		
		System.out.println("Enter elements of array B: ");
		for (int i = 0; i < N; i++)
			B[i] = scan.nextInt();
		
		System.out.println("Array A: ");
		for (int x: A)
			System.out.print(x + " ");
		
		System.out.println("\nArray B: ");
		for (int x: B)
			System.out.print(x + " ");
		
		int C[] = new int[M+N];
		C = Mix(M, A, N, B);
		
		System.out.println("\nArray C: ");
		for (int x: C)
			System.out.print(x + " ");
	}
	
	public static int[] Mix(int m, int[] a, int n, int[] b)
	{
		int c[] = new int[m+n];
		int t = 0;
		
		for (int i = 0; i < m; i++)
		{
			if (a[i]%2 == 0)
			{
				for(int j = 0; j < (m+n); j++)
				{
				c[j] = a[i];
				t++;
				}
			}
			
			else
			{
				for(int j = 0; j < (m+n); j++)
				{
					c[m+n-j-1] = a[i];
				}
			}
		}
		
		for (int i = 0; i < m; i++)
		{
			if (b[i]%2 == 0)
			{
				for(int j = 0; j < (m+n-t); j++)
				{
				c[j+t] = b[i];
				t++;
				}
			}
			
			else
			{
				for(int j = 0; j < (m+n-t); j++)
				{
					c[m+n-j-t-1] = b[i];
				}
			}
		}
		
		return c;
	}
}
