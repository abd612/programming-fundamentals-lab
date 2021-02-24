public class PhoneCheck
{
	public static void main(String[] args)
	{
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		phone1.setMake("OnePlus");
		phone1.setModel("One");
		phone1.setYear(2014);
		
		phone2.setMake("Huawei");
		phone2.setModel("Honor 4C");
		phone2.setYear(2002);
		
		if (phone1.isObsolete())
			System.out.println(phone1 + "\nis Obsolete.");
		else
			System.out.println(phone1 + "\nis not Obsolete.");
		
		if (phone2.isObsolete())
			System.out.println(phone2 + "\nis Obsolete.");
		else
			System.out.println(phone2 + "\nis not Obsolete.");
		
	}
}
