import java.util.Random;

public class Account1
{
	private double balance;
	private String name;
	private long acctNum;
	private static int numAccounts;
	
	public Account1(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}
	
	Random rand = new Random();
	
	public Account1(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
		numAccounts++;
	}
	
	public Account1(String owner)
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
