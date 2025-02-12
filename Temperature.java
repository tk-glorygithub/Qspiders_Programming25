
import java.util.Scanner;
class Temperature
{
	public static void main(String[] args) 
	{
		System.out.println("Write a program to convert Celcius to Farenite");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the celcius in degree");
		
		Float celcius = sc.nextFloat();
		
		Float Farenite = (9/5)*celcius+32;
		
		System.out.println("Farenite conversion of celcius is  " + Farenite);
		
	}
}
