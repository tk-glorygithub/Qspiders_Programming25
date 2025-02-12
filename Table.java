import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the Range");
		int Range = sc.nextInt();
		
		for( num =1; num<=Range;num++)
		{
		System.out.println( num + "X" + Range  + "="  +(num*Range));	
		}
		
	}
}
