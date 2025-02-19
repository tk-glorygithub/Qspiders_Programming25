import java.util.Scanner;
class NeonNumber 
{
	/*A neon number is a positive integer where the sum of the digits of its square is equal to the number itself. 
	For example, 9 is a neon number because the square of 9 is 81, 
	and the sum of the digits of 81 (8 + 1) is 9, which is equal to the original number */
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the NUmber");
		int num = sc.nextInt();
		int sum = 0;
		int val = num*num;
		for(int i = val;i>0;i/=10){
		int rem = i%10;
		sum += rem;
		}
	
	
		if(num == sum){
			System.out.println(num + " is NeonNumber");
		}
			else {
			System.out.println(num + " is not NeonNumber");	
			}
		
		
	}
}

//keith number
//buzz number -divide by 7 or last digit 7 
//duck numbern - must not contain 0 at starting else condition approved
// sunny number -  entered num +1 must be  perfect num then its sunny num
//spy num -l