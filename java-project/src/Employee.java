// Muhammad Abdullah, 2015-EE-166

public abstract class Employee extends Worker
{
	protected String dept;
	protected double bSalary;
	
	public Employee(String n, int h, String d, double bs)
	{
		super(n,h);
		dept = d;
		bSalary = bs;
	}
	
	protected abstract double calcSalary();
	
	public void setDept(String d)
	{
		dept = d;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setBSalary(double bs)
	{
		bSalary = bs;
	}
	
	public double getBSalary()
	{
		return bSalary;
	}
	
	public String toString()
	{
		String bs = Double.toString(bSalary);
		return (super.toString() + "\nDepartment: " + dept + "Basic Salary: " + bs);
	}
}
