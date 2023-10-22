package www.test.sathya;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int number=123456789;
		int reverse=0;
		while(number>0)
		{
			System.out.println("the given number is :"+number);
			 int  remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("The reverse number is :"+reverse);
	}
}
