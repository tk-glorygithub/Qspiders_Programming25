class Loops 
{
	public static void main(String[] args) 
		
	{
		System.out.println("Print the NUMBERS");
		for( int i =0;i<=10;i++){
			System.out.print(i + " ");
	}
	
	System.out.println();
	System.out.println("Print the LOWER CASE");
	for( char ch = 'a'; ch <='z' ; ch++){
			System.out.print(ch + " ");
	}
	
		System.out.println();
	System.out.println("Print the UPPER CASE ");
	for( char ch = 'A'; ch <='Z' ; ch++){
			System.out.print(ch  + " ");
	}
		 	System.out.println();
			 
			 
			 System.out.println("Print the DIGITS ");
		
			for( char ch = '0'; ch <='9' ; ch++){
			System.out.print(ch + " ");
	}
		
		
		 	System.out.println();
			
		 	System.out.println("Print the ASCII VALUES");
		
		for( int i = 0; i <= 127 ; i++){
			System.out.println( i + "  =   " +(char)i );
	}
	}
}
