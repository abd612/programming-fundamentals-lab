// Muhammad Abdullah, 2015-EE-166

public class Fruit
{
	protected String name;
	protected double weight;
	
	public Fruit(String n, double w)
	{
		name = n;
		weight = w;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setWeight(double w)
	{
		weight = w;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		String w = Double.toString(weight);
		return ("Fruit (" + name + "): " + w + " kg");
	}
}
