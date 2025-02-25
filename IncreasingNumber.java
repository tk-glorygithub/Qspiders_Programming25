import java.util.Scanner;
class IncreasingNumber 
{
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the Number :- ");
		int num = new Scanner(System.in).nextInt();
		boolean increasing = true;
		int dup = num;
		int prev = num%10;
			num /= 10;
		while (num>0)
		{   
			int currDigit = num%10;
			if( currDigit >= prev){
				increasing = false;
				break; 
			}
			prev = currDigit;
			num /=10;
		}
		
		if(increasing){
		System.out.println( dup +" Num is Increasing Number");
		}
		else {
			System.out.println( dup +" Num is not  Increasing Number");
		}
	}
}
