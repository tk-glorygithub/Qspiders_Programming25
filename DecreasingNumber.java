import java.util.Scanner;
class DecreasingNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :- ");
		int num = new Scanner(System.in).nextInt();
		boolean  Decreasing = true;
		int dup = num;
		int prev = num%10;
			num /= 10;
		while (num>0)
		{   
			int currDigit = num%10;
			if( currDigit <= prev){
				 Decreasing = false;
				break;
			}
			prev = currDigit;
			num /=10;
		}
		
		if( Decreasing){
		System.out.println( dup +" Num is  Decreasing Number");
		}
		else {
			System.out.println( dup +" Num is not   Decreasing Number");
		}
	}
}
