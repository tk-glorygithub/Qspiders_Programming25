import java.util.Scanner;
class   HIquestion
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		
		
		System.out.println((n%2==0 && n%5==0)?("hi five hi two"):((n%2==0)?("hi two"):((n%5==0)?("hi five"):("Blank"))));
	}
}

