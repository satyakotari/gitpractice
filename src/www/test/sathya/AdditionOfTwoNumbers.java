package www.test.sathya;

public class AdditionOfTwoNumbers {
	int num1=20;
	int num2=30;
	public void addition()
	{
		int result = num1+num2;
		System.out.println("The addition of two numbers is :"+result);
	}
public static void main(String[] args) 
{
	AdditionOfTwoNumbers  add = new AdditionOfTwoNumbers();
           int number1 = add.num1;
           System.out.println("the first number is :"+number1);
           int number2=add.num2;
           System.out.println("the second number is:"+number2);
           add.addition();
}
}
