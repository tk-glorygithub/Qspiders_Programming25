import java.util.Scanner;
class SpyNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Entered the Number ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int dup = num;
		int Product = 1;
		while(num>0){ 
			int rem = num%10;
			sum+=rem;
			Product *=rem;
			
			num/=10;
			
		}
		if( sum == Product){
			System.out.println( dup + " is SpyNumber ");
		}
		else{
		System.out.println( dup + " is Not SpyNumber ");
		}
	}
}
