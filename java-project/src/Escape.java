import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Escape
{
	public static void main(String[] args)
	{
		System.out.println("Next line: \n Tab: \t Inverted Commas: \' \" Backslash: \\ Backspace: \b Return: \r");
		System.out.println("Basa\rCdfdf");
		
		float f = (float) 2/2;
		double d = 3/3;
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("^^^^^^^^^");
		System.out.println("^ Hello ^");
		System.out.println("^^^^^^^^^");
		
		String str = "Space, the final frontier.";
		System.out.println (str.length());
		System.out.println (str.substring(7));
		System.out.println (str.toUpperCase());
		System.out.println (str.length());
		
		String phrase = "Change is inevitable";
	      String mutation1, mutation2, mutation3, mutation4;

	      System.out.println ("Original string: \"" + phrase + "\"");
	      System.out.println ("Length of string: " + phrase.length());

	      mutation1 = phrase.concat (", except from vending machines.");
	      mutation2 = mutation1.toUpperCase();
	      mutation3 = mutation2.replace ('E', 'X');
	      mutation4 = mutation3.substring (3, 30);
	      
	      System.out.println ("Mutation #1: " + mutation1);
	      System.out.println ("Mutation #2: " + mutation2);
	      System.out.println ("Mutation #3: " + mutation3);
	      System.out.println ("Mutation #4: " + mutation4);

	      System.out.println ("Mutated length: " + mutation4.length());

	      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	      NumberFormat fmt2 = NumberFormat.getPercentInstance();
	      DecimalFormat fmt3 = new DecimalFormat("0.00000");
	      
	      double c = 234.54, p = 0.99, a = 0.340;
	      
	      System.out.println(fmt1.format(c));
	      System.out.println(fmt2.format(p));
	      System.out.println(fmt3.format(a));
	      
	      System.out.print("first line");
	      System.out.println();
	      System.out.print("second line");
	}
}
