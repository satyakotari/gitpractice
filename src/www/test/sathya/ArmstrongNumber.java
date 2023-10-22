package www.test.sathya;

public class ArmstrongNumber 
{
public static void main(String[] args) 
{
	int number =371;
	int temp,remainder;
	int sum=0;
	temp=number;
	while(number!=0)
	{
		remainder=number%10;
		sum= sum+(remainder*remainder*remainder);
		number=number/10;
	}
	if(temp==sum)
	{
		System.out.println(sum+   "Is an armstrong number");
	}
	else
	{
		System.out.println(sum+   "Is not an armstrong number");
	}
	System.out.println("completed");
}
}
