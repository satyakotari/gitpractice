package www.test.sathya;

public class FibonacciSeries 
{
	 static   int num1=0;
			 static int num2=1;
			 static int   num3;
public static void fibonacci()
{
for(int i=0; i<=13; ++i)
{
     num3=num1+num2;
	System.out.println(num3);
	 num1=num2;
	num2=num3;
}
	}
public static void main(String[] args)
{
	int num1rep= num1;
	System.out.println(num1rep);
	int num2rep1=num2;
	System.out.println(num2rep1);
	fibonacci();
}
}
