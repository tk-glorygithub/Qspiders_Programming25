class Method_AmstrongNum 
{
	public static void main(String[] args) 
	{
		/* int Value = Count(1234);
		  int 	Total = Power(Value , 2);
		System.out.println(Total);  */
		if  (Amstrong(153)){
		System.out.println(" Amstrong Number");	
		}
		else {
		 System.out.println(" Not Amstrong Number");	
		}
	}
	
	public static boolean Amstrong(int num){
		int len = Count(num);
		int sum =0;
		for(int i = num ;i!=0;i/=10){
			sum += Power(i%10, len );
		}
		return sum ==num;
		
		
	}
	public static int Count(int num){
		int count = 0;
		for(int i =num ;i!=0;i/=10){
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
