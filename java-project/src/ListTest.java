public class ListTest
{
	public static void main(String[] args)
	{
		IntList myList = new IntList(10);
		myList.add(100);
		myList.add(50);
		myList.add(200);
		myList.add(25);
		System.out.println(myList);
		
		SortedIntList myList2 = new SortedIntList(10);
		myList2.add(100);
		myList2.add(50);
		myList2.add(200);
		myList2.add(25);
		myList2.add(101);
		myList2.add(51);
		myList2.add(201);
		myList2.add(-1);
		myList2.add(202);
		myList2.add(166);
		
		System.out.println(myList2);
		
		SortedIntListMod myList3 = new SortedIntListMod(10);
		myList3.add(100);
		myList3.add(50);
		myList3.add(200);
		myList3.add(25);
		myList3.add(101);
		myList3.add(51);
		myList3.add(51);
		myList3.add(-1);
		myList3.add(202);
		myList3.add(166);
		
		System.out.println(myList3);
	}
}
