public class methods
{
	public static void main(String[] args)
	{
		sayHi();
		sayHito("Abd");
		System.out.println(sayHiwith());
	}
	
	public static void sayHi()
	{
		System.out.println("Hi!");
	}
	
	public static void sayHito(String name)
	{
		System.out.println("Hi " + name + "!");
	}
	
	public static int sayHiwith()
	{
		System.out.println("Hi with!");
		return 612;
	}
}
