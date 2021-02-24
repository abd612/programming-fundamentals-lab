import java.util.Random;

public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	Random rand = new Random();
	
	public Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	public Account(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rand.nextLong();
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
