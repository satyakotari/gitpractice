package www.test.sathya;
//write a program to check  a given number positive or negative?
public class CheckPositiveNegativeNumber
{ 
     int num1=900;
	public void first()
	{
	System.out.println("Given number is :"+num1);
	}
	public  void Positive()
	{
		
		if(num1>0)
			System.out.println("Given number is positive:"+num1);
	}
	public void negative()
	{
		
		if(num1<0)
			System.out.println("Given number is negative:"+num1);
	}
	public static void main(String[] args)
	{

		CheckPositiveNegativeNumber  talent = new CheckPositiveNegativeNumber();
	    talent.first();
		talent.Positive();
		talent.negative();
		System.out.println(" successfuly completed to check the given number is positive or negative: ");

	}

}
