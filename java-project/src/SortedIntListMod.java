public class SortedIntListMod extends IntList
{
	private int place;
	
	public SortedIntListMod(int size)
	{
		super(size);
	}
	
	public void add(int value)
	{
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else
		{
			// find slot where value should go
			int loc = 0;
			while (loc < numElements && list[loc] < value)
				loc++;
			// move everything to the right of it over
			for (int i = numElements; i > loc; i--)
				list[i] = list[i - 1];
			// put it in its place
			list[loc] = value;
			numElements++;
		}
	}
}
