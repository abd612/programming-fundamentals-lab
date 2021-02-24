public class pass
{
	public static void main(String[] args)
	{
		int x = 5;
		System.out.println("x is " + x);
		
		System.out.println(change(x));
	}
	
	public static int change(int num)
	{
		return ++num;
	}
}
