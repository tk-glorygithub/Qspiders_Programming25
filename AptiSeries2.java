
// 10 30 68 130 222

class AptiSeries2 
{
	public static void main(String[] args) 
	{
		for(int i = 2 ; i <= 6 ;i++ ){
			int pow = 1;
			for(int j = 1; j <=3 ;j++){
			 pow *=i;
			}
			
			 System.out.print( pow+i + " ");
			//System.out.println();
		}
		
	}
}
