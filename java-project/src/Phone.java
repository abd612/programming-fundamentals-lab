public class Phone
{
	private String make;
	private String model;
	private int year;
	
	public Phone()
	{
		make = "NULL";
		model = "NULL";
		year = 0;
	}
	
	public void setMake(String a)
	{
		make = a;
	}
	
	public void setModel(String b)
	{
		model = b;
	}
	
	public void setYear(int c)
	{
		year = c;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public boolean isObsolete()
	{
		return (year < 2006);
	}
	
	public String toString()
	{
		String y = Integer.toString(year);
		return ("Make: " + make + "\t" + "Model: " + model + "\t" + "Year: " + year);
	}
}
