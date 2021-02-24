import java.util.Random;

public class Account2
{
	private double balance;
	private String name;
	private long acctNum;
	private static int numAccounts;
	
	public Account2(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}
	
	Random rand = new Random();
	
	public Account2(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
		numAccounts++;
	}
	
	public Account2(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rand.nextLong();
		numAccounts++;
	}
	
	public static int getNumAccounts()
	{
		return numAccounts;
	}
	
	public void close()
	{
		name += " CLOSED";
		balance = 0;
		numAccounts--;
	}
	
	public static Account2 consolidate(Account2 acct1, Account2 acct2)
	{
		if ((acct1.name.equals(acct2.name)) && (acct1.acctNum != acct2.acctNum))
		{
			Account2 acct3 = new Account2((acct1.balance + acct2.balance), acct1.name);
			acct1.close();
			acct2.close();
			
			return acct3;
		}
		
		else
		{
			System.out.println("Accounts cannot be consolidated");
			return null;
		}
			
	}
	
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	
	public void withdraw(double amount, double fee)
	{
		if (balance >= (amount + fee))
			balance -= (amount + fee);
		else
			System.out.println("Insufficient funds");
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nAccount number: " + acctNum + "\nBalance: " + balance;
	}
}
