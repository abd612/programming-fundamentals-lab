public class Diamond
{
	public static void main(String[] args)
	{
		int number = 10;
		
		for (int counter1 = 1; counter1 <= number; counter1++)
		{
			for (int counter2 = number; counter2 > counter1; counter2--)
			{
				System.out.print(" ");
			}
			
			for (int counter3 = 0; counter3 < (2 * counter1 - 1); counter3++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int counter1 = 1; counter1 < number; counter1++)
		{
			for (int counter2 = 0; counter2 < counter1; counter2++)
			{
				System.out.print(" ");
			}
			
			for (int counter3 = (2 * number - 1); counter3 > (2 * counter1); counter3--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
