import java.util.Scanner;

class EmirpNumber 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
		int dup = num ;
		boolean flag = true;
		
		//int length = String.valueOf(num).length();
		
		for(int i = 2 ; i< num ;i++){
			if(num % i ==0){
			flag = false;
			break;
			}
			
		}
		if(flag){
			System.out.println("The num is prime " + num);
		//break;
		} else {
		System.out.println("the num is not prime");
		}
		
		// reversing the num
		int RevNum =0;
		int temp = dup;
		
		while (temp > 0){
			
		int rev = temp %10;
		 RevNum = RevNum *10 + rev;
	       temp /= 10;
		}
		System.out.println("rev num is " + RevNum);
		
		// check rev num is prime
		flag = true;
		for(int i = 2 ; i< RevNum ;i++){
			if(RevNum % i ==0){
			flag = false;
			break;
			}
			
		}
		if(flag){
		
			System.out.println(RevNum + " is Emirp num");
		}
		else{
			
			System.out.println("The RevNum is not Emirp  " +		RevNum);
		}
		
		}
}
