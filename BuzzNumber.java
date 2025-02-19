import java.util.Scanner;

class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number");
		int num = sc.nextInt();
		
		if((num %7) ==0 || (num %10) == 7){
		System.out.println(num + " is a Buzz Number");	
		}
		else{
			System.out.println(num + " is a Not Buzz Number");		
		}
		
	}
}
