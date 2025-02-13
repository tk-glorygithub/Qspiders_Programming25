
// 10 30 68 130 222

class AptiSeries2 
{
	public static void main(String[] args) 
	{
		for(int i = 2 , p = 2; i <= 6 ;i++ ,p*=2){
			int pow = 1;
			for(int j = 1; j <p ;j++){
			 pow *=3;
			 System.out.print( pow + i);
			}
		}
	}
}
