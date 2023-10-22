/**
 * 
 */
package www.test.sathya;
/**
 * @author Sathya veni
 *
 */
public class SwappingNumbers
{
	public static void main(String[] args)
	{
int num1=20;
int num2=30;
int temp;
if (num1<num2)
{
 System.out.println("BEFORE SWAPPING:" +num1+"  "+ num2);
 temp = num1;
 num1=num2;
 num2=temp;
 System.out.println("AFTER SWAPPING :" +num1+" " +num2);
}
else
{
	System.out.println("SWAPPING IS NOT POSSIBLE:");
}
	}
}
