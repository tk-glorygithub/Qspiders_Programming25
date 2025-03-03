import java.util.Scanner;

class MethodProgram2 
{
	// check the Number is Palandromic Prime or not
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int ip = sc.nextInt();
		int rev = Palandrome(ip);
			
		// Palandrome( num ); //121
		if(ip == rev &&  Prime(ip)){
			System.out.println(" It is Palandromic Prime");
		}
		else
		{
		System.out.println(" Not Palandromic Prime !");	
		}
	}
	
	public static int Palandrome(int num ){
	     int value = 0;
		for(int i = num ;i>0;i/=10){
		int rev = num %10;
		 value = value *10+ rev;
			
		}
		return value;
	}
	public static boolean Prime(int val)
	{
		int den =2;
		for(; den<val;den++)
		{
		if(val/den ==0)	{
		break;	
		
		}
		}
		return val == den;
		
	}
	
}
