
import java.util.Scanner;
class AreaCircle 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Radius of Circle in cm^2");  
	   float n = sc.nextFloat();
		 final Float Pie =22/7f;
		 Float Perimeter = 2*Pie*n;
		
	   float Circle = Pie*(n*n);
		System.out.println("Area of Circle is" +" "+ Circle);
				System.out.println("The  Perimeter of circle is" +" "+ Perimeter);
		
	}
}
