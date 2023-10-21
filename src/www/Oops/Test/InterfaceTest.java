package www.Oops.Test;

 interface Interface
 {
	   void ministmt();
	   public abstract void balenq();
	    void setpin();
	    void cashDeposite();
	   static  void Account()
	   {
		 System.out.println("account creation");
	   }
}
class  Bank implements Interface
{
public 	void ministmt()
{
	System.out.println("Mini statment");
}
public void balenq()
{
	System.out.println("balance enqury");
}
public void setpin()
{
	System.out.println("set pin");
}
public void cashDeposite()
{
	System.out.println("cash deposited ");
		
}
}
public class  InterfaceTest
{
	public static void main(String[] args) 
	{
		Bank  obj=new Bank();
		obj.setpin();
		obj.balenq();
		obj.cashDeposite();
		obj.ministmt();
			
	}
}

