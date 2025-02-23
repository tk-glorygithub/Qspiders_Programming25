import java.util.Scanner;

class BinaryToDecimal 
{
	public static void main(String[] args) 
	{   //1011
		//int num = 1100;
		System.out.println("Enter the Binary Number");
		String num = new Scanner(System.in).next();
		int decimalNum =0;
		int pow = 1;
		for(int i=num.length()-1;i>=0;i--){
			if(num.charAt(i)=='1'){
	 decimalNum= decimalNum +pow; //1 -1=2=3 , 3+8
			
		}
		pow *= 2; //2 ,4 ,8 ,16
		}
		System.out.println(  decimalNum);
		
		// with direct library convert Binary to decimal
		System.out.println(Integer.parseInt(num,2));
	
}
}
