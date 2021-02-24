import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args)
	{
		BiasedCoin coin1 = new BiasedCoin();
		
		System.out.println("Enter the biases for Coin2 and Coin3: ");
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		BiasedCoin coin2 = new BiasedCoin(a);
		BiasedCoin coin3 = new BiasedCoin(b);
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		for(int i = 0; i < 100; i++)
		{
			coin1.flip();
			if (coin1.isHeads())
				c1++;
			
			coin2.flip();
			if (coin2.isHeads())
				c2++;
			
			coin3.flip();
			if (coin3.isHeads())
				c3++;
		}
		
		System.out.println("Heads for Coin1: " + c1);
		System.out.println("Heads for Coin2: " + c2);
		System.out.println("Heads for Coin3: " + c3);
	}
}
