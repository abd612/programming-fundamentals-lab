// Muhammad Abdullah, 2015-EE-166

public class TestWorker
{
	public static void main(String[] args)
	{
		HourlyEmployee w1 = new HourlyEmployee("Asghar Ali", 8, "Clerk", 15000);
		SalariedEmployee w2 = new SalariedEmployee("Alia Rashid", 7, "Reception", 18000, 500);
		Manager w3 = new Manager("Adil Riaz", 5, 10, 2);
		Project[] list = new Project[2];
		list[0] = new Project("abc", 50);
		list[1] = new Project ("def", 10);
		w3.setPList(list);
		System.out.println(w3.getPList());
		System.out.println("Hourly Employee: " + w1);
		System.out.println("Salaried Employee: " + w2);
		System.out.println("Manager: " + w3);
	}
}
