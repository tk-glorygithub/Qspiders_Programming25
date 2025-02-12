class MultiplyDigit 
{
	public static void main(String[] args) 
		
	{
		int num = 12345;
		int Product = 1;
		
		int rem = num %10; //4
		Product =Product*rem; //4
		num = num/10; //123
		
		 rem = num%10; // 3
		Product = Product * rem; // 7
		num = num/10;   //12

		 rem = num%10; // 2
	Product = Product *rem; // 9
		num = num/10;
		
		 rem = num%10; // 2
	Product = Product *rem; // 9
		num = num/10;
		
		 rem = num%10; // 1
		Product = Product *rem; // 10
		
		
		System.out.println(Product);
	}
}
