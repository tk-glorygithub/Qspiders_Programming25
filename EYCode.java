


// 144 2197 196 3375 256
class  EYCode
{
	public static void main(String[] args) 
	{
		
		for(int i = 1 , num = 12 ;i <= 10 ; i++ , num++){
		 
		  /* if(i % 2 == 0){
		 System.out.print( i *i + " ");
			
		}
		else {
			 System.out.print( i *i * i + " ");
		}
		*/
		
		int pow = 1;
		int p= num %2 ==0 ? 2 :3;
		for(int j =1;j<= p ;j++)
			pow *= num;
		System.out.print( pow + " ");
		
	}
}
}
