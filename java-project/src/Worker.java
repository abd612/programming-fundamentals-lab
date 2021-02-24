// Muhammad Abdullah, 2015-EE-166

public class Worker
{
	protected String name;
	protected int hours;
	
	public Worker(String n, int h)
	{
		name =  n;
		hours = h;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setHours(int h)
	{
		hours = h;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public String toString()
	{
		String h = Integer.toString(hours);
		return ("Name: " + name + "\nWorking Hours: " + h);
	}
}
