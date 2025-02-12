class ReverseNum2
{
	public static void main(String[] args) 
	{
		 int num = 4567;
		 int duplicate = num;
		 int rev =0;
		 while (num >0)
		 {
			 int rem = num %10;
			 rev = rev *10 +rem;
				 num = num/10;
		 }
		System.out.println(" The reverse num of  " + duplicate  + "is "  + rev);
	}
}
