class ReverseNum 
{
	public static void main(String[] args) 
	{
		int num = 709;
		System.out.println("The value is " + num);
		int dup =num;
		int rev = 0;
		
		int rem = num%10;
		rev = rev*10 + rem;
		
		 num = num/10;
		 rem = num%10;
		rev = rev*10 + rem;
		
		 num = num/10;
		 rem = num%10;
		rev = rev*10 + rem;
		
		System.out.println("The Num is " + dup + " & the Reverse num is" + rev);
		
	}
}
