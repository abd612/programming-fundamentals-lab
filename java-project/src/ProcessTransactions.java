import java.util.Scanner;

public class ProcessTransactions
{
	public static void main(String[] args)
	{
		Account3 acct1, acct2;
		String action;
		double amount;
		long acctNumber;
		int nextDay = 0;

		Scanner scan = new Scanner(System.in);

		acct1 = new Account3(1000, "Sue", 123);
		acct2 = new Account3(1000, "Joe", 456);


		while (nextDay != -1)
		{
			System.out.println("The following accounts are available: \n");
			acct1.printSummary();

			System.out.println();
			acct2.printSummary();
			
			String keepGoing = "y";

			while (keepGoing.equals("y") || keepGoing.equals("Y"))
			{
				System.out.println("\nEnter the number of account you would like to access: ");
				acctNumber = scan.nextLong();

				System.out.println("Would you loke to make a deposit (D) or withdrawal (W) ? ");
				action = scan.next();

				System.out.println("Enter the amount: ");
				amount = scan.nextDouble();

				if (amount > 0)
				{
					if (acctNumber == acct1.getAcctNumber())
						if (action.equals("w") || action.equals("W"))
							acct1.withdraw(amount);
						else if (action.equals("d") || action.equals("D"))
							acct1.deposit(amount);
						else
							System.out.println("Sorry, invalid action.");

					else if (acctNumber == acct2.getAcctNumber())
						if (action.equals("w") || action.equals("W"))
							acct2.withdraw(amount);
						else if (action.equals("d") || action.equals("D"))
							acct2.deposit(amount);
						else
							System.out.println("Sorry, invalid action.");

					else
						System.out.println("Sorry, amount must be > 0 .");

					System.out.println("\nMore transactions? (y/n)");
					keepGoing = scan.next();
				}
			}

			System.out.println("Number of deposits: " + Account3.getNumDeposits());
			System.out.println("Number of withdrawals: " + Account3.getNumWithdrawals());
			System.out.println("Total deposits: " + Account3.getTotalDeposits());
			System.out.println("Total withdrawals: " + Account3.getTotalWithdrawals());
			
			Account3.resetNumDeposits();
			Account3.resetNumWithdrawals();
			Account3.resetTotalDeposits();
			Account3.resetTotalWithdrawals();
			
			System.out.println("\nDo you want to continue to the next day? (yes: 0, no: -1)");
			nextDay = scan.nextInt();
		}
	}
}
