import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter Operand 1");
		float Input1 = sc.nextFloat();
		  System.out.println("Enter Operand 2");
		float Input2 = sc.nextFloat();
		  System.out.println("Enter Operand");
		char Output= sc.next().charAt(0);
		
		float Calculator =0;
		
		 Calculator = ( Output =='+')?Input1 + Input2:
			             ( Output =='-')?Input1 - Input2:
			             ( Output =='*')?Input1 * Input2:
			             ( Output =='/')?Input1 / Input2:
			             ( Output =='%')?Input1 % Input2:0.00001F;
		
		String Result = Input1 + " "  + Output + " "  +Input2 + " = " +   Calculator;
		if(!(Calculator == 0.00001f ))
			System.out.println(Result);
		//System.out.println( "The Calculated value is :" + Input1 + " "  + Output + " "  +Input2 + " = " +   Calculator);
		
		
	}
}
