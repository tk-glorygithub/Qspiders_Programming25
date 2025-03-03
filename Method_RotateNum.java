class Method_RotateNum
{
	public static void main(String[] args) 
	{ /*
		// for rotating the Single number 
		System.out.println( Reverse(1234));
		*/
		//for(int ip =100;ip<1000;ip++){
		int ip =1617;
		int Rotate = Reverse(ip);
		while(Rotate!= ip)
		{
		System.out.print( Rotate + " " );
		 Rotate= Reverse(Rotate);
			
		}
		System.out.println(Rotate);
	//}
	//System.out.println();
	}
	
	// check the Rotated number is Prime or not,if its prime then print
	public static boolean isPrime(int num)
	{ 
		boolean flag = true;
		for(int i =2;i*i<num ;i++){
		
			if(num%2 ==0){
				flag = false;
				break;
			}
		}
		if(flag){
		return true;
		}
		return false;
		
		
	}
	
	public static int Reverse( int num)
	{
		int rem = num%10;
		int ct =Count(num);
		num/=10;
		int RoatatingNum = rem*Power(10,ct-1)+num; // ct error = 40123
		if(isPrime(RoatatingNum)){
			return RoatatingNum;
		}
		return System.out.println(" not prime"); // void cant convert to int
		
	}
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
