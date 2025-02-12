
import java.util.Scanner;

class  CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("        CURRENCY CONVERTER");
		System.out.println();
		System.out.println("ENTER THE AMOUNT IN INR");
		float inr = sc.nextFloat();  //100
		System.out.println();
		
		
		System.out.println("**LIST OF CURRENCY**");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GPB");
		System.out.println("4. PKR");
		System.out.println("5. LDR");
		System.out.println("6. JPY");
		
		System.out.println();
		
		System.out.println(" ENTER THE CURRENCY" );
		String curr = sc.next().toUpperCase();
		float ConCurr =0;
		
		if(curr.equals("USD")){
			ConCurr  = inr/86.56f;
			System.out.println( inr +"    INR  "  + ConCurr +"   USD");
			
		}
		
		if(curr.equals("EUR")){
			ConCurr  = inr/90.25f;
			System.out.println( inr +"   INR"  + ConCurr +"  
			EUR");
			
		}
		
		if(curr.equals("GPB")){
			ConCurr  = inr/107.65f;
			System.out.println( inr +"   INR   "  +ConCurr +"  GPB");
			
		}
		
		if(curr.equals("PKR")){
			ConCurr  = inr/0.3098f;
			System.out.println( inr +"  INR  "  + ConCurr +"  PKR");
			
		}
	
		if(curr.equals("CAD")){
			ConCurr  = inr/60.078f;
			System.out.println( inr +"    INR "  + ConCurr +" CAD");
			
		}
		
		if(curr.equals("JPY")){
			ConCurr  = inr/0.5571f;
			System.out.println( inr +"   INR   "  + ConCurr +"   JPY");
			
		}
		
	}
}
