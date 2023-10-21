package basicprograms;
public class Armstrong 
{
public static void main (String[] args)
{
	int number=153,sum=0,remainder=0,temp;
	temp=number;
	while(number!=0)
	{
		remainder= number%10;
		sum=remainder*remainder*remainder+sum;
		number=number/10;
	}
	if(temp==sum)
	{
		System.out.println("GIVEN NUMBER IS ARMSTRONG");
	}
	else
	{
		System.out.println("GIVEN NUMBER IS NOT ARMSTRONG");
	}
}
}
