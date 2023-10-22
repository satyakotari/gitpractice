package www.Oops.Test;
import java.util.*;
class ConstructorProg
{
	int practice;
	String result;
	int sum;	
	public ConstructorProg( int pra,
	String res,int sum)
	{
		practice=pra;
		result=res;
	 this.	sum= sum;
	 int add=practice+sum;
	 System.out.println(add);
	 System.out.println("practice is :"+practice +" "+"result is :"+result+"  "+"sum is:" +sum);
	}	}
	 //  public  void method()
		//{  
		  // int add=practice+sum;
			//System.out.println("practice is :"+practice +" "+"result is :"+result+"  "+"sum is:" +sum);
			//System.out.println(add);
			
		//}
    // public void addition()
     //{
    	// int add=practice+sum;
    	 //System.out.println(add);
     //}
//}
public class ConstructorTest {
public static void main(String[] args) {	
	ConstructorProg prog = new ConstructorProg(9 ,"job", 9);

}
}
