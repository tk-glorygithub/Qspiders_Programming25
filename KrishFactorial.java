import java.util.Scanner;
class  KrishFactorial  //num = 145 - krishnaMurthy number
// in this the num is give and the sum of  factorial of digit is equals to te given digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i = num ;i>0; i/=10){
		int rem = i %10;
		int fact = 1;
		for(int j = 1;j<=rem;j++)
			fact *=j;
			sum +=fact;
		
		
		}
		System.out.println( num == sum ?" KRISH " : " NOT KRISH");
	}
}
