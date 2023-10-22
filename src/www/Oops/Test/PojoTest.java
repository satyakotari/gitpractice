	package www.Oops.Test;
	class Pojo
	 {
		// in pojo class contains only methods and variables but not business implementation
		// in pojo class variables should be private both static and non static
		// in pojo class methods should be public 
		private int hours;
		private String hardwork;
		private float sal;
		private double hike;
		// in this variables we created variables but not initialized so set values we use set method
		public void sethours( int hou)
		{
		 hours = hou;
		}
		public void sethardwork(String hw)
		{
			hardwork=hw;
		}
		public void setsal(float salary)
		{
			sal=salary;
		}
		public void sethike(double hk)
		{
			hike=hk;
		} 
		public int gethours()
		{
			return hours;
		}
		public String gethardwork()
		{
			return hardwork;
		}
		public float getsal()
		{
			return sal;
		}
		public double gethike()
		{
			return hike;
		}
	 }
			public class PojoTest
		{
				public static void main(String[] args) 
			{
				Pojo p = new Pojo();
				p.sethardwork("job");
				p.sethours(9);
				p.setsal(40000);
				p.sethike(200000);
				System.out.println(p.gethours());
				System.out.println(p.gethardwork());
				System.out.println(p.getsal());
				System.out.println(p.gethike());	
			}
		}
	
	
		
	
	
	
	

	