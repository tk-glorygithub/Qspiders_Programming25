class SumOfDigits 
{
	public static void main(String[] args) 
		
	{
		int num = 1234;
		int sum = 0;
		
		int rem = num %10; //4
		sum = sum +rem; //4
		num = num/10; //123
		
		 rem = num%10; // 3
		sum = sum +rem; // 7
		num = num/10;   //12

		 rem = num%10; // 2
		sum = sum +rem; // 9
		num = num/10;
		
		 rem = num%10; // 1
		sum = sum +rem; // 10
		
		
		
		System.out.println(sum); // value is not proper its 9 instead of 10
	}
}
