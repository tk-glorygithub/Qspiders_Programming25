import java.util.Scanner;
class FactorsNumCount 
{
	public static void main(String[] args) 
	{  	System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
	
		int count =0;	
		for(int i =2; i< num ;i++){
			if(num %i ==0){
			 count ++;
			 System.out.print( i + " ");
			}
		}
		System.out.println();
		
		if(count ==0){
		System.out.println( num + " is Prime");	
		}
		else {
		 System.out.println( num + "  is not Prime");	
		}
		System.out.println( "Count  : " + count);
	}
}
