
import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		System.out.println("Print Area & Volume of a Cylinder");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius  of a Cylinder");
		Float Radius = sc.nextFloat(); 
			System.out.println("Enter Height  of a Cylinder");
		Float Height = sc.nextFloat();
		Float pie = 3.14f;
		float Area = pie*(Radius*Radius);
		float Volume = Area*Height;
		System.out.println("Area of a Cylinder is " + Area);
		System.out.println("Volume  of a Cylinder  is  " +	Volume);
		
	}
}

