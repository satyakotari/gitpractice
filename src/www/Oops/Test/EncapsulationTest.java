package www.Oops.Test;
  class Encapsulation
  {
	private int PracticeHrs=60;
	private String hardwork ="i got job in november";
	// if you are using private as access modifier then we cannot access that values directly only we can access by get method only
	public int  getPracticeHrs()
	{
		return PracticeHrs;
	}
	public String getharkwork()
	{
		return hardwork;
	}
  }
	  public class EncapsulationTest
	  {
	  public static void main(String[] args) 
	  {
		  Encapsulation sat=new Encapsulation();
		System.out.println(sat.getharkwork());
		System.out.println(sat.getPracticeHrs());
	}

}
