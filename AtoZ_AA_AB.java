import java.util.Scanner;

class AtoZ_AA_AB 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Letter");
		String Letter =sc.next().toUpperCase();
		
		//System.out.println("  Letter is " + Letter);
		
		int value = 0;
		
		for(int i = 0;i<Letter.length();i++){
			char ch = Letter.charAt(i);
			value = value * 26 +(ch - 'A' +1);
		
		}
		System.out.print( "Numeric value of  " + Letter + " is "  + value);	
	}
}
