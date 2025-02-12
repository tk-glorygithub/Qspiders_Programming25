import java.util.Scanner;
class StringNumberPrint 
{
	
	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
	int num = sc.next();
	String number = "";
	
		while (num >0)
		{
			int rem= num % 10;
		
		
		switch (rem)
		{
			
		case 1: 
			number= "one"+ number;
		break;
		
		case 2: 
			number= "Two"+ number;
		break;
		
		case 3: 
			number= "Three"+ number;
		break;
		
		
		case 4: 
			number= "Four"+ number;
		break;
		
		case 5: 
			number= "Five"+ number;
		break;
		
		case 6: 
			number= "Six"+ number;
		break;
		
		case 7: 
			number= "Seven"+ number;
		break;
		
		case 8: 
			number= "Eight"+ number;
		break;
		
		case 9: 
			number= "Nine"+ number;
		break;
		
		case 0: 
			number= "Zero"+ number;
		break;
		
	
		}
		num /= 10;
		
		}
		System.out.println(number);
		
	}
}
