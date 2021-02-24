// Muhammad Abdullah, 2015-EE-166

public class Project
{
	private String title;
	private int progress;
	
	public Project(String t, int p)
	{
		title = t;
		progress = p;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setProgress(int p)
	{
		progress = p;
	}
	
	public int getProgress()
	{
		return progress;
	}
	
	public String toString()
	{
		String p = Double.toString(progress);
		return ("Title: " + title + "\nProgress: " + p + "%");
	}
}
