// Muhammad Abdullah, 2015-EE-166

public class Mango extends Fruit
{
	private String type;
	private char grade;
	private int rate;
	private double price;
	
	public Mango(String n, double w, char g)
	{
		super(n,w);
		
		grade = g;
		
		switch (grade)
		{
			case 'a':
			case 'A':
				type = "AnwarRatol";
				rate = 120;
				break;
				
			case 'd':
			case 'D':
				type = "Dosehri";
				rate = 90;
				break;
				
			case 's':
			case 'S':
				type = "Sindhri";
				rate = 70;
				break;
				
			case 'l':
			case 'L':
				type = "Langra";
				rate = 55;
				break;
				
			default:
				break;
		}
		
		this.setPrice();
	}
	
	public void setPrice()
	{
		price = rate * weight;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		String p = Double.toString(price);
		return (super.toString() + "\n" + type + " Aam Rs. " + p);
	}
}
