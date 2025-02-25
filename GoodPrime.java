import java.util.Scanner;
class GoodPrime 
{ 
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a  Number");
	     int num = new Scanner(System.in).nextInt();
		 int dup = num;
		boolean flag = true;
		for(int i = 2;i<num ;i++){
		if(num % i == 0){
			flag = false;
			break;
		}		
		}
		if(!flag){
			   System.out.println(dup + " is NOT a Good Prime (because it's not a prime number).");
            return;
		}
		
		   boolean areAllDigitsPrime = true;
			while(num >0){	
				//extrcting the single digit
				int rem = num %10;
				// check the digit is prime or not
				 boolean isDigitPrime = true;
				 
				if(rem <2) isDigitPrime = false;
				else{
				for(int i = 2;i<rem ;i++){
		   if(rem % i == 0){
			  
			 isDigitPrime = false;
			break;
		}
		}
				}
				
				if( !isDigitPrime){
			  areAllDigitsPrime = false;
		}
		 System.out.println(rem + " is " + (isDigitPrime ? "a prime digit." : "NOT a prime digit."));
		
		num /=10;	
			}
			  // Final Good Prime check
        if (areAllDigitsPrime) {
            System.out.println(dup + " is a GOOD PRIME!");
        } else {
            System.out.println(dup + " is NOT a Good Prime (because not all digits are prime).");
		}
		
	}
}
