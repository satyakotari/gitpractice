package www.test.sathya;
public class PalindromeNumber 
{
		public static void main(String[] args)
		{
			int number=12345;
			int reverse=0;
			int temp=number;
			while(number>0)
			{
				System.out.println("the given number is :"+number);
				 int  remainder=number%10;
				reverse=reverse*10+remainder;
				number=number/10;
			}
			if(temp==reverse)
			{
			System.out.println("The given  number is palindrome :"+reverse);
		}
			else
			{
				System.out.println("The given  number is not  palindrome :"+reverse);
			}
	}

}
