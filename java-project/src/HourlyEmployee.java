// Muhammad Abdullah, 2015-EE-166

public class HourlyEmployee extends Employee
{
	private double salary;
	
	public HourlyEmployee(String n, int h, String d, double bs)
	{
		super(n,h,d,bs);
		salary = this.calcSalary();
	}
	
	protected double calcSalary()
	{
		return (bSalary * hours);
	}
	
	public void setSalary(double s)
	{
		salary = s;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		String s = Double.toString(salary);
		return (super.toString() + "\nTotal salary: " + s);
	}
}
