import java.util.Scanner;

class PoundsKilogram 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Convert Pounds into Kilograms");
		
		System.out.println("Enter the Pound value");
	//	Scanner sc = new Scanner(System.in);
		float Pounds = new Scanner(System.in).nextFloat();
		
		float OnePound = 0.454f;
		float TotalKilogram = OnePound *Pounds;
		System.out.println("Conversion of " + Pounds +"is " + TotalKilogram);
		
	}
}
 