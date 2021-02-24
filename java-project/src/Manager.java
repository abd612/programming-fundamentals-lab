// Muhammad Abdullah, 2015-EE-166

public class Manager extends Worker
{
	private int mEmployees;
	private Project[] pList;
	
	public Manager(String n, int h, int me, int np)
	{
		super(n, h);
		mEmployees = me;
		pList = new Project[np];
	}
	
	public void setMEmployees(int me)
	{
		mEmployees = me;
	}
	
	public int getMEmployees()
	{
		return mEmployees;
	}
	
	public void setPList(Project[] pl)
	{
		for (int i = 0; i < pList.length; i++)
			pList[i] = pl[i];
	}
	
	public Project[] getPList()
	{
		return pList;
	}
	
	public String toString()
	{
		String me = Integer.toString(mEmployees);
		String result = (super.toString() + "\nEmployees managed: " + me);
		
		for (int i = 0; i < pList.length; i++)
			result += ("\n" + pList.toString());
		
		return result;
	}
}
