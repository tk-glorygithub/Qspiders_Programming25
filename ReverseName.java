class ReverseName 
{
	public static void main(String[] args) 
	{
		/* String name = "Nightmare";
		String rev ="";
		
		for(int i =0;i <=name.length()-1;i++){
		 rev = name.charAt(i) + rev;
		}
		System.out.print(rev); */
		String palindrome = "nayat";
		String palindrome2 = "";
		for(int i =0;i<=palindrome.length()-1;i++){
			palindrome2 = palindrome.charAt(i) + palindrome2 ;
			
		}
		if (palindrome.equals(palindrome2))
		{
			System.out.println(" String is palindrome");
		}else {
		System.out.println(" String is not palindrome");
		}
	}
}
  