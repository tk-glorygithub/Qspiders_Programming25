
class palndrome_Methods 
{
	public static void main(String[] args) 
	{
		String str[] = {"nayan" ,"madam", "ritik"}; 
		for(int i =0;i<str.length;i++)
		{
		if(palandrome(str[i])){
		System.out.println(str[i]);
		
		}
		else{
			
		System.out.println("not palandrome");	
		}
		}
	}
	// two pointer
	/*
	public static boolean palandrome(String ele)
	{
		boolean flag = false;
		int l=0;
		int r = ele.length()-1;
		for(int i =0;i<ele.length();i++)
		{
		if(ele.charAt(l)== ele.charAt(r))
			{
				flag = true;
				l++;
				r--;
			}
			
		}
		return flag;
		
	}  */
	
	// string buffer
	
/*	public static boolean palandrome(String ele)
	{
		return ele.contentEquals(new StringBuffer(ele).reverse());
	}
	
	*/
	//reverse method
	public static boolean palandrome(String ele)
	{
		String rev= "";
		for(int i =0;i<ele.length();i++)
		{
			rev = ele.charAt(i)+rev;
			
		}
		 if(rev.equals(ele)){
			 
		 return true;
		 }
		 return false;
	}
}
