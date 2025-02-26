
class Methods 
{
	public static void main(String[] args) 
	{
		//Fibonacci(5);
		prime(16);
	}
	
	public static void Fibonacci(int n )
	{
		int Fib =1;
		for(int i =1;i<=n;i++){
		 Fib =  Fib*i;
		}
	
		System.out.println(Fib);
	}
	
	public static void prime(int n )
	{
		boolean flag = true;
	    	for(int i = 2;i<n;i++)
			{
			if(n%i ==0)
				{
			flag = false;
				break;
			   }
			}
			if(flag ){
			System.out.println( n + " is  Prime Number");	
			}
			else {
				System.out.println( n + " is not prime Number");
			}
	}
}
