class MaxDigitNumber 
{
	public static void main(String[] args) 
	{
		
		int num = 123985867;
		int max = 0;
		int min = 9;
		for( int i = num ;i >0;i/=10){
			int digit = i %10;
			if(max < digit){
				max = digit;
			}
			if(min > digit){
			min = digit;	
			}
		}
				System.out.println("Smallest digit from  " + num + " is " + min);
		System.out.println("Largest digit from  " + num + " is " + max);
	}
}
