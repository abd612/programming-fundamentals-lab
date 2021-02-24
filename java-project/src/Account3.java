import java.util.Random;

public class Account3
{
	private double balance;
	private String name;
	private long acctNum;
	
	private static int numDeposits;
	private static double totalDeposits;
	private static int numWithdrawals;
	private static double totalWithdrawals;
	
	public static int getNumDeposits()
	{
		return numDeposits;
	}
	
	public static double getTotalDeposits()
	{
		return totalDeposits;
	}
	
	public static int getNumWithdrawals()
	{
		return numWithdrawals;
	}
	
	public static double getTotalWithdrawals()
	{
		return totalWithdrawals;
	}
	
	public static void resetNumDeposits()
	{
		numDeposits = 0;
	}
	
	public static void resetTotalDeposits()
	{
		totalDeposits = 0;
	}
	
	public static void resetNumWithdrawals()
	{
		numWithdrawals = 0;
	}
	
	public static void resetTotalWithdrawals()
	{
		totalWithdrawals = 0;
	}
	
	public Account3(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	Random rand = new Random();
	
	public Account3(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	public Account3(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	public void withdraw(double amount)
	{
		if (balance >= amount)
			{
				balance -= amount;
				numWithdrawals++;
				totalWithdrawals += amount;
			}
		else
			System.out.println("Insufficient funds");
	}
	
	public void withdraw(double amount, double fee)
	{
		if (balance >= (amount + fee))
			{
				balance -= (amount + fee);
				numWithdrawals++;
				totalWithdrawals += (amount + fee);
			}
		else
			System.out.println("Insufficient funds");
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		
		numDeposits++;
		totalDeposits += amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public long getAcctNumber()
	{
		return acctNum;
	}
	
	public void printSummary()
	{
		System.out.println("Name: " + name + "\nAccount number: " + acctNum + "\nBalance: " + balance);
	}
	
	public String toString()
	{
		return "Name: " + name + "\nAccount number: " + acctNum + "\nBalance: " + balance;
	}
}
