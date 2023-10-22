package www.Oops.Test;
import java.io.*;
public class ConsoleTest
	{
	public static void main(String[] args)
	{
	Console c=System.console();
	System.out.println("enter your name");
	String s = c.readLine();
	System.out.println( "your name is :"+s);

	System.out.println( "the first number is:");
	float f1=Float.parseFloat(c.readLine());
	System.out.println( "your numbers is "+f1);

	float f2=Float.parseFloat(c.readLine());
	System.out.println( "your numbers is "+f2);

	float f3= f1+f2;
	System.out.println("the addition of two numbers is:"+f3);

	}
	}

}
