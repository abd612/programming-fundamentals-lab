import java.util.Scanner;

public class TestAccounts2
{
	public static void main(String[] args)
	{
		System.out.println("Enter three names:");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		
		Account2 acct1 = new Account2(100, a);
		Account2 acct2 = new Account2(100, b);
		Account2 acct3 = new Account2(100, c);
		
		System.out.println("Account1: " + acct1);
		System.out.println("Account2: " + acct2);
		System.out.println("Account3: " + acct3);
		
		acct1.close();
		Account2 acct4 = Account2.consolidate(acct2, acct3);
		
		System.out.println("Account1: " + acct1);
		System.out.println("Account2: " + acct2);
		System.out.println("Account3: " + acct3);
		System.out.println("Account4: " + acct4);
	}
}
