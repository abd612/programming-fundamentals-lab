public class Beer
{
	public static void main(String[] args)
	{
		int n = 10;
		
		for (int i = 100; i > 100 - n; i--)
		{
			System.out.println(i + " bottles of beer on the wall");
			System.out.println(i + " bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			System.out.println((i-1) + " bottles of beer on the wall");
		}
	}
}
