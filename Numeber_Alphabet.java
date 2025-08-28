
class Numeber_Alphabet

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		long contact = sc.nextLong();
		
		System.out.println("Name : %s , Contact : %d ",name , contact);
		
		System.out.println(" |%-10s %-10s| %n ",  "NAME", "CONTACT" );
		System.out.println(" |%-10s %-10s| %n ",   "RAMESH", "9123456788" );
		System.out.println(" |%-10s %-10s| %n " ,  "SURESH", "9108645678");
		System.out.println(" |%-10s %-10s| %n ",   "JAYESH", "9123456509");
		
		System.out.println(" %.2f",(22/7.0));
	}
}
