package www.test.sathya;

public class IsADigit
{
	
	public static void main(String[] args)
	{
		System.out.println("Given data is digit or not ");
		char var ='7';
		System.out.println("value:"+var);
		if (Character.isDigit (var))
			System.out.println("given data is digit:");
		else
			System.out.println("given data is not digit:");
	}
}