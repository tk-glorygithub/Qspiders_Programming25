class  PatterPresentation
{
	public static void main(String[] args) 
	{
	 /*	int n=5;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if(j==1 || (i==1 && j<=(n+1)/2 ) || (j==3 && i=(n+1)/2) )
					System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		
		
		for(int i =1;i<=4;i++)
		{
			int n=1;
			for(int j =0 ;j< 4-i;j++)
			{
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print(n+"   ");	
				//if(j<(5/2))
					n=n*((i-j)/j);
				//else
					//n=n*((i-j)/i);
			}
			System.out.println();
		}
	}
}
