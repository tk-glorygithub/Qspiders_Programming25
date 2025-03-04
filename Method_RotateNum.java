class Method_RotateNum
{
	public static void main(String[] args) 
	{ 
		// for the one number its  gives op as :- 7161 1716 6171 1617
	
		/* 
		int ip =1617;
		int rot = rotate(ip);
		while(rot!= ip)
		{
		System.out.print( rot + " " );
		 rot = rotate(rot);
			
		}
		System.out.println(rot);
	   */
	   
	   // for finding the range of given number
	   for(int i = 1;i<=1000;i++){
		   if(isRotating(i)){
			  System.out.print(i + "  "); 
		   }
		   
	   }
	}
	
	// check the Rotated number is Prime or not,if its prime then print
	public static boolean isRotating (int num)
	{
	
		if(isPrime(num))
		{
		int rot= rotate(num);
		while(  rot!= num  &&  isPrime(rot))
			{
			rot = rotate(rot);
			}
		return num == rot;	
		}
		return false;
	}
	
	// check for prime
	public static boolean isPrime(int num )
	{
	int den = 2;
	for( ; den<num ;den++)
	{
	if(num %den ==0){
	return false;	
	}
		
	}
	return true;
	}
	
	// Reverse the Number
	public static int rotate( int num) //1617
	{
		int rem = num%10;
		int ct =Count(num);
		num/=10;
			return rem*Power(10,ct-1)+num;	
	}
	
	// count the length of the Number
	public static int Count(int num){
		int count = 0;
		for(int i =num ;i>0;i/=10){
		count++;		
		}
		return count;
	}
	public static int Power(int count, int digit){
		int pow = 1;
		for(int i =1;i<= digit;i++){
		pow *=  count;	
		}
		return pow;
	}
}
