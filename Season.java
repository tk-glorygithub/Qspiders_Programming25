import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{   
		System.out.println("Enter the MOnth");
		String Month = new Scanner(System.in).next().toUpperCase();
		
		String Season = (Month.equals("mar") || Month.equals("feb") || Month.equals("apr") || Month.equals("may"))?("It is Summer seson"):((Month.equals( "oct")|| Month.equals("nov") || Month.equals("dec") || Month.equals("jan"))?("It is Winter seson"):( (Month.equals( "jun") || Month.equals("july") || Month.equals("aug") || Month.equals("sep")) ?("It is Monson"):( "You have enterd a wrong value")));
		//System.out.println("Hello World!");
	}
}
