public class TestShift
{
	public static void main(String[] args)
	{
		int[] list = {1,2,3,0,0};
		
		for(int x: list)
			System.out.println(x);
		
		System.out.println();
		
		for(int i = (list.length-2); i >= 1; i--)
			list[i+1] = list[i];
		
		for(int x: list)
			System.out.println(x);
	}
}
