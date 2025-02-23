import java.util.Scanner;

class BouncyNumber 
{
	public static void main(String[] args) 
	{
		  System.out.print("Enter a number: ");
	   int num = new Scanner(System.in).nextInt();
	  boolean  increasing = false, decreasing = false;
	  int dup = num;
	  
	   if(num>100){
		   int prevDigit = num%10;
	     num /=10; 
		 
		while(num>0){
		int currDigit = num%10;
		if(currDigit < prevDigit){
			increasing = true;
		}
		else if(currDigit > prevDigit){
			decreasing = true;
			
		}
		prevDigit =	currDigit;
		num/=10;
		}
		// check if num is bouncy or not
		
		if( increasing  && decreasing){
			System.out.println(dup + "is  Bouncy Number");
		}
			else{
				System.out.println(dup + " is not bouncy Number");
				
			}
			
		
		
		  
		   
		   
	   }
	   else{
		   System.out.print(dup   + " is Not Bouncy num, Num (must be at least 3 digits). ");
		   
	   }
	  
	   
	   

	}
}
