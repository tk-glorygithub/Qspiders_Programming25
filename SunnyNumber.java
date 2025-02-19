import java.util.Scanner;
class  SunnyNumber
// enterd number +1 must euals to  be perfect Square  -then the number is Sunny Number
{
	public static void main(String[] args) 
	{
		 System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		
		int PerfectSquare = num+1;
		 boolean isPerfect = false; 
		 
		for(int i =2; (i*i) <= PerfectSquare;i++){
			
			if((i*i)==PerfectSquare ){
				isPerfect= true;
				break;
			}
	}
		if(isPerfect ){
			System.out.println( num + " is a Sunny Number.");
		}
		else {
		System.out.println(num + "Not  a Sunny Number.");
	}
	}
}
