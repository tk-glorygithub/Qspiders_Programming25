
import java.util.Scanner;

class RateofInterest 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of Months");
	    int Month = sc.nextInt();
		int Years = Month/12;
		int RemMonths  =Month%12;
		//String  str =  Float.ParseFloat(String_name); 
		
	
		System.out.println(Years + (RemMonths/10.0));
	}
}
