package www.test.sathya;
// write a program to swap a given numbers without using a third variables?
public class SwapWithOutVariable 
{
	int num1=100;
	int num2=300;
	public void  swap()
	{
		System.out.println("The numbers to swap is:"+num1+" "+num2);
		if(num1<num2)
		{
			System.out.println("Before swapping:"+num1+" "+num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			System.out.println("After swapping :"+num1+ " "+num2);
		}
		else
		{
			System.out.println("Swapping is not posible");
		}
	}
	public static void main (String[] args)
	{
		SwapWithOutVariable test = new SwapWithOutVariable();
		test.swap();
	}
}
