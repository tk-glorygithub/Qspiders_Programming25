class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		
		int num = 121;
			int dup = num;
		int rev = 0;
		while(num >0){
		 int rem = num %10;
		 rev = rev *10 + rem;
		 num = num /10;
		 
		}  
		
		if (dup == rev )
		{
				System.out.println("The number is Palindrome");
		}
		else {
			
			
		System.out.println("The number is not  Palindrome");
		}
		System.out.println("The number is " + dup );
		System.out.println("The reverse number is " + rev );
	}
}
