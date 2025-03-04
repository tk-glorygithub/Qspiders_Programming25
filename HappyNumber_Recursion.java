// the Number is Happy when the last value is 1 
// Number is sad when the last number is 4 
// on basis of that  the code defines it as true and false


class HappyNumber_Recursion 
{
	
	public static void main(String[] args) 
	{
		System.out.println(isHappy(10));
	}
	public static boolean isHappy(int num){
		int sum =SumOfSqDigits( num );
		
		while(sum !=4 && sum!=1){
			sum =SumOfSqDigits( sum );
		}
		return (sum ==1)?( true):( false);	
	}
	
	public static int SumOfSqDigits(int num )
	{
		int sum = 0;
		while(num!=0){
		int last = num%10;
		sum += last*last;
			num/=10;
			
		}
		return sum;
		
	}
}
