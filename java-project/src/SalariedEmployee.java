// Muhammad Abdullah, 2015-EE-166

public class SalariedEmployee extends Employee
{
	private double bonus;
	private double salary;
	
	public SalariedEmployee(String n, int h, String d, double bs, double b)
	{
		super(n,h,d,bs);
		bonus = b;
		salary = this.calcSalary();
	}
	
	protected double calcSalary()
	{
		return (bSalary * hours + bonus);
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	public double getBonus()
	{
		return bonus;
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
		String b = Double.toString(bonus);
		String s = Double.toString(salary);
		return (super.toString() + "\nBonus: " + b + "\nTotal salary: " + s);
	}
}
