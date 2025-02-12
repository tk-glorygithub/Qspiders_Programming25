import java.util.Scanner;

class PrimeFactors 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for(int i = num ;i > 0 ;i--){
		if(num%i == 0){
			int m = i;
			
			int c;
			for(c = 2 ;c<m;c ++){
				
				if(m %c ==0){
					break;
				}
			}
			if(c == m){
		
			System.out.println(m + " is Prime");
			
			}
		} 
			}
}
}
		
		
		
