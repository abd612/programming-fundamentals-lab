import java.util.Scanner;

public class MultiArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = scan.nextInt();
		System.out.println("Enter number of columns:");
		int col = scan.nextInt();
		
		int[][] array = new int[row][col];
		
		System.out.println("Enter the elements:");
		
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				array[i][j] = scan.nextInt();
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
				System.out.print(array[i][j] + " ");
			
			System.out.println();
		}
				
	}
}
