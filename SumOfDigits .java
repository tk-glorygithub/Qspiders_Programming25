class SumOfDigits 
{
	public static void main(String[] args) 
		
	{
		int num = 1234;
		int Sum = 0;
		
		int rem = num%10;
		sum = sum +rem;
		num = num/10;
		
		int rem = num%10;
		sum = sum +rem;
		num = num/10;

		int rem = num%10;
		sum = sum +rem;
		num = num/10;
		
		
		System.out.println(Sum);
	}
}
