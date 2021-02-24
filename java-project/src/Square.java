import java.util.Scanner;

public class Square
{
	int[][] square;
	
	public Square(int size)
	{
		square = new int[size][size];
	}
	
	public int sumRow(int row)
	{
		int sum = 0;
		
		for (int i = 0; i < square.length; i++)
			for (int j = 0; j < square.length; j++)
				sum += square[row][j];
		
		return sum;
	}
	
	public int sumCol(int col)
	{
		int sum = 0;
		
		for (int i = 0; i < square.length; i++)
			for (int j = 0; j < square.length; j++)
				sum += square[i][col];
		
		return sum;
	}
	
	public int sumMainDiag()
	{
		int sum = 0;
		
		for (int i = 0; i < square.length; i++)
			for (int j = 0; j < square.length; j++)
				sum += square[i][i];
			
		return sum;
	}
	
	public int sumOtherDiag()
	{
		int sum = 0;
		
		for (int i = 0; i < square.length; i++)
			for (int j = 0; j < square.length; j++)
				sum += square[i][square.length - 1 - i];
		
		return sum;
	}
	
	public boolean magic()
	{
		for (int i = 1; i < square.length; i++)
			if (sumRow(i) != sumRow(i-1))
				return false;
		
		for (int j = 1; j < square.length; j++)
			if (sumCol(j) != sumCol(j-1))
				return false;
		
		if (sumRow(0) != sumCol(0) || sumRow(0) != sumMainDiag() || sumCol(0) != sumOtherDiag())
			return false;
		
		return true;
	}
	
	public void readSquare(Scanner scan)
	{
		for (int i = 0; i < square.length; i++)
			for (int j = 0; j < square.length; j++)
				square[i][j] = scan.nextInt();
	}
	
	public void printSquare()
	{
		for (int i = 0; i < square.length; i++)
		{
			for (int j = 0; j < square.length; j++)
				System.out.print(square[i][j] + "\t");
			
			System.out.println();
		}
		
	}
}
