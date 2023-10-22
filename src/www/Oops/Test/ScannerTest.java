package www.Oops.Test;
import java.util.*;
public class ScannerTest 
{
int first;
int second;
public void add()
{
	int result = first+second;
	System.out.println("THE ADDITION OF TWO NUMBERS:"+result);
}
public void sub()
{
	int results=first*second;
	System.out.println("the subraction of two numbers is :"+results);
}

public static void main(String[] args) 
{
ScannerTest obj=new ScannerTest();
Scanner name = new Scanner (System.in);

System.out.println("enter the first value");
int f1=name.nextInt();
obj.first=f1;


System.out.println("enter the second value");
int f2=name.nextInt();
obj.second=f2;

obj.add();
obj.sub();



}

}

