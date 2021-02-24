public class IntegerList
{
	int[] list;
	
	public IntegerList(int size)
	{
		list = new int[size];
	}
	
	public void randomize()
	{
		for (int i = 0; i < list.length; i++)
			list[i] = (int) (Math.random() * 100) + 1;
	}
	
	public void print()
	{
		for (int i = 0; i < list.length; i++)
			System.out.println(i + ":\t" + list[i]);
	}
}
