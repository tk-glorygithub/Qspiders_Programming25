class SumOddeEven 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int evenSum =0;
		int OddSum = 0;
		
		int temp =0;
		
		int rem = num%10; //4
		temp = (rem%2 ==0 )? (evenSum =evenSum+rem) :(OddSum=OddSum+rem); // even -4
		
		
		num =num/10; // 123
		rem = num%10; //3
		temp = (rem% 2 ==0 )? (evenSum =evenSum+rem) :(OddSum=OddSum+rem); //0dd 3
		
		num =num/10; //12
		 rem = num%10; //2
		temp = (rem%2 ==0 )? (evenSum =evenSum+rem) :(OddSum=OddSum+rem); // 4+2 =6 
		
		num =num/10;  //1
		 rem = num%10; //1
		temp = (rem%2 ==0 )? (evenSum =evenSum+rem) :(OddSum=OddSum+rem); // 3+ 1 = 4
		
		
		System.out.println( " The even sum is " +evenSum);
			System.out.println( " The odd sum is "   +OddSum);
	}
}
