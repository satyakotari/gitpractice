package basicprograms;

public class HoursIntoMinutes {
	// Java program to convert hours
	// into minutes and seconds
	  
	// Function to convert hours
	// into minutes and seconds
	 static void ConvertHours(int n)
	{
	 int minutes, seconds, Hour;
	  
	    minutes = n * 60;
	    seconds = n * 3600;
	  Hour = n*minutes+seconds;
	    System.out.println( "Minutes = " + minutes
	        + ", Seconds = " + seconds +  "Hour="  +Hour);
	}
	  
	// Driver code
	    public static void main (String[] args) 
	    {
	    int n = 1;
	    ConvertHours(n);
	    }
	      
	}


