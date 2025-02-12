import java.util.Scanner;

class BankingSystem

{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		String username1 = null;
		String password1 = null;
		String adress = null;
		Long contact =0;
		double balance =0.0;
		
		for(; ;)
		{
		System.out.println();	
		System.out.println(   "            WELCOME   ");
		System.out.println("              LAXMI CHEAT FUND  ");
		System.out.println();
		System.out.println("  1. EXISTING USER");
        System.out.println("  2.CREATE ACCOUNT ");
		System.out.println("Enter an Option");
		int opt = sc.nextInt();
		if(username1 ==nul){
			System.out.println("CREATE YOUR ACCOUNT);
		    continue;
		
		}
		
		System.out.println("     LOGIN");
		System.out.println();
		
		
		for(int i = 3;i>=1;i--)
			{
			System.out.println();
			System.out.println("Username  : ");
			String username = sc.next();
			System.out.println("  Password");
			String password = sc.next();
			if(username.equals(username1) && password.equals(password1))
				{
				home :
					for(  ;  ;)
					
					{
						System.out.println();
						System.out.println( "  HOME  PAGE ");
						System.out.println();
						System.out.println(" 1. DEPOSIT");
						System.out.println(" 2. WITHDRAW ");
						System.out.println(" 3. CHECK BALANCE");
						System.out.println(" 4. MINI STATEMENT ");
						System.out.println("  5. LOGOUT");
						System.out.println();
						System.out.println(" Enter an option ");
						int opt1 = sc.nextInt();
						switch(opt1)
						{
						 case 1 :{
						  System.out.println(" DEPOSIT");
						  System.out.println();
						  System.out.println("Enter the amount");
						  double depositAmt  = sc.nextDouble();
						  balance += depositAmt;
						  System.out.println( " AMOUNT DEPOSITED SUCESS ");
						  System.out.println();
						  break;
						 }
						 
						 case 2:{
						   System.out.println("WITHDRAW");	
						   System.out.println();
						   System.out.println(" Enter the amount : ");
						   double withdraw = sc.nextDouble();
						   System.out.println(" Enter the Pin : ");
						   String password3 = sc.next();
						   if(password3.equals(password1))
							 {
							  if(withdraw <= balance){
								balance -= withdraw;
								System.out.println( " AMOUNT DEBITED SUCESS");
							  }
							  else {
								System.out.println("INSUFFICIENT FUNDS");  
							  }
							 }
							 else {
							   System.out.println(" WRONG PIN");	 
								 
							 }
							 break;
							 
						 }
						 case 3:{
							 System.out.println("  CHECK BALANCE ");
							 System.out.println();
							 for(int j=3;j>=1;j--)
							 {
							   System.out.println();
							   System.out.println("  ENTER THE PIN");
							   String password2 = sc.next();
							   if(password2.equals(password1)){
								System.out.println(  " ACCOUNT BALANCE  : "   + balance + " rs");   
								continue home;
							   }
							   else {
								System.out.println("  WRONG PIN");
								
							   }
							   
							 }
							 
						 }
						}
					}
				}
			
			}
	}
}
