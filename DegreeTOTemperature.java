import java.util.Scanner;

class DegreeTOTemperature 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("  ");
		System.out.println("    Welcome  To Temperature Conversion ");
		System.out.println(" 1. Degree celcius to Farenite ");
		System.out.println(" 2. Degree celcius to Kelvin ");
		System.out.println(" 3. Degree celcius to Rankie ");
		System.out.println(" 4. Degree celcius to Reaumur ");
		System.out.println("  ");
		
		System.out.println("Choose the Option ?");
		int op = sc.nextInt();
		
	//	int DegreeCelcius = 
	
	if (op ==1)
	{
		System.out.println("converting Degree celcius into Farenite ");
		System.out.println(" Enter Degree in  Celcius  ");
		float DegreeCelcius = sc.nextFloat();
		float Fahrenheit = (DegreeCelcius *(9.0f/5))+32 ;
		System.out.println("  ");
		System.out.println(" conversion of Degree celcius " + DegreeCelcius  + " To  Fahrenheit is - " +  Fahrenheit );
		
	}
	
	else if (op ==2)
	{
		System.out.println("converting Degree celcius into Kelvin ");
		System.out.println(" Enter Degree in  Celcius  ");
		float DegreeCelcius = sc.nextFloat();
		float Kelvin = DegreeCelcius + 273.15f ;
		System.out.println("  ");
		System.out.println(" conversion of Degree celcius " + DegreeCelcius  + " To Kelvin is -" +  Kelvin );
		
	}
	
	else if (op ==3)
	{
		System.out.println("converting Degree celcius into Rankie ");
		System.out.println(" Enter Degree in  Celcius  ");
		float DegreeCelcius = sc.nextFloat();
		float Rankie = (DegreeCelcius *(9.0f/5))+ 491.67f;
		System.out.println("  ");
		System.out.println(" conversion of Degree celcius " + DegreeCelcius  + " To  Rankie is - " +  Rankie );
		
	}
	
	else if (op ==4)
	{
		System.out.println("converting Degree celcius into Reaumur ");
		System.out.println(" Enter Degree in  Celcius  ");
		float DegreeCelcius = sc.nextFloat();
		float Reaumur = (DegreeCelcius *(4.0f/5));
		System.out.println("  ");
		System.out.println(" conversion of Degree celcius " + DegreeCelcius  + " To  Reaumur is -" + Reaumur );
		
	}
	else {
		System.out.println(" Enetr the proper Option");
	}
		
	}
}
