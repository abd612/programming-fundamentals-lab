public class AliasesCheck
{
	public static void main(String[] args)
	{
		String S = "NULL" ,T = "NULL";

		System.out.println(S);
		System.out.println(T);
		
		S = "UET";
		
		System.out.println(S);
		System.out.println(T);
		
		T = S;
		
		System.out.println(S);
		System.out.println(T);
		
		T = "NUST";
		
		System.out.println(S);
		System.out.println(T);
		
		T += " is a university.";
	
		System.out.println(S);
		System.out.println(T);
	}
}
