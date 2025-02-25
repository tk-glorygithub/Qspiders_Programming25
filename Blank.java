import java.util.Scanner;
class Blank{
	//code for checking Good Prime
	public static void main(String[] args) 
	{ 
		System.out.print("Enter Range 1 - ");
		int R1 = new Scanner(System.in).nextInt();
		System.out.print("Enter Range 2 - ");
		int R2 = new Scanner(System.in).nextInt();
		
		for(int i = R1 ;i<=R2;i++){
			boolean prime = true;
			
			if(i<2) continue;
			for(int j = 2;j*j<=i;j++){
				if(i%j ==0){
					prime = false;
					break;
					
				}
				
				
			}
			if(prime){
		//	System.out.print(i + " ");	
		      int num = i;
			  boolean goodprime = true;
			  while (num>0)
			  {
				  int rem = num%10;
				  boolean digitPrime = true;
				  if(rem <2){
					  digitPrime = false;
					  
				  }
				  for(int j = 2;j*j<=rem ;j++){
					  if(rem %j ==0){
						  digitPrime = true;
						  break;
					  }
					  
				  }
				  
			
			  if(!digitPrime){
				  goodprime = false;
				  break;
			  }
			  num/=10;
				
			  }
			if(goodprime){
				
				System.out.print(i + " ");	
			}
			}
		}
		
	}
}
