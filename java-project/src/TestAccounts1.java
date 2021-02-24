import java.util.Scanner;

public class TestAccounts1
{
	public static void main(String[] args)
	{
		Account1 testAcct;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many accounts would you like to create?");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			testAcct = new Account1(100, "Name" + i);
			System.out.println("\nCreated account " + testAcct);
			System.out.println("Now there are " + Account1.getNumAccounts() + " accounts");
		}
	}
}
