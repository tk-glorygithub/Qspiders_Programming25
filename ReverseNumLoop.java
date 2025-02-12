import java.util.Scanner;
class  ReverseNumLoop
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Number");
		 int num = new Scanner(System.in).nextInt();
		 int dup = num;
		 int sum =0;
		 while(num >0){
			 
			 int rem = num % 10;
			 sum += rem;
			 num /= 10;
			
			 
		 }
		  System.out.println(sum);
			  System.out.println(dup);
			  
			   System.out.println(" sum of even num");
			   int val =0;
			 while (num >0){
				if ( num %2 ==0){
					 val =val+ num;
					
				}
				
				 
				
				 
				 
					 
					 
				
			 }
			 System.out.println( "The vallue of reverse sum is  " + val);
			 
	}
}
