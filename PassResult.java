
import java.util.Scanner;
class   PassResult
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		Float num = sc.nextFloat();
		Float result =( num/600)*100;
		
		String Total = (result >= 35)?("Your result is pass"):("Result is fail");
		String Grade = (result >= 75 &&  result <= 100)?( "Your grade is A"):( (result >= 60 &&  result <= 60)?("Grade B"):((result >= 60 &&  result <= 35)?( "You are pass"):("Result is fail" )));
		System.out.println(Total);
			System.out.println(Grade);
	}
}
