import java.io.*;
import java.util.Scanner;

public class FileInput
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("D:\\Test.txt"));
		int t = 0;
		int[] c = new int[300];
		
		while(scan.hasNext())
		{
			String line = (String) scan.next();
			
			for (int i = 0; i<line.length(); i++)
			{
				if ((line.charAt(i)>=33 && line.charAt(i)<=47) || (line.charAt(i)>=58 && line.charAt(i)<=63)
				|| (line.charAt(i)>=90 && line.charAt(i)<=96) || (line.charAt(i)>=123 && line.charAt(i)<=126))
				{
					c[line.charAt(i)]++;
					t++;
				}
			}
		}
		
		System.out.println("Symbols\tQuantity");
		System.out.println("\nTotal\t" + t);
		for (int i = 0; i < 200; i++)
			if (c[i]>0)
				System.out.println((char) i + "\t" + c[i]);
	}
}
