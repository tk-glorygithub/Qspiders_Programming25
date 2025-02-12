
class PrimeFactorSum 
{
	public static void main(String[] args) 
	{
		
		int num = 323;
		//int rev = 0;
		int sum =0;
		int fact = 1;
		
     /*int rem = num %10;
	   
	   while (num >0)
	   {
		   int rem = num %10;
		   rev = rev + rem;
		   for(int i = rem ;i>0;i--){
			 fact = fact * i;  
			   
	   }
	   sum  = sum + fact ;
	   }
	   num = num/10;
			
		System.out.println(sum);  */
		
		while (num >0)
		{
	
			
		
		int rem = num%10;
			if(rem != 1 || rem !=0){
		if(rem %2 !=0){
		   for(int i =rem ;i>0;i--){
			   
			   fact = fact *i;
			   
			   
		   }
			   
		   sum = sum +fact;
			
			
		}
			}
		num = num /10;
		}
		
		//System.out.println(fact);
		System.out.println(sum);
	}
}
