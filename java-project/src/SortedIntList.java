public class SortedIntList extends IntList
{
	private int place;
	
	public SortedIntList(int size)
	{
		super(size);
	}
	
	public void add(int value)
	{
		place = 0;
		
		if(numElements == list.length)
			System.out.println("Can't add, list is full");
		else
		{
			for(int i = numElements - 1; i >= 0; i--)
				if(value > list[i])
				{
					place = i+1;
					break;
				}
				
				for(int i = (numElements-1); i >= place; i--)
					list[i+1] = list[i];
		}
			
		list[place] = value;
		numElements++;
	}
}
