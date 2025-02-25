import java.util.Scanner;
class BinaryNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String bin ="";
		for(int i =num;i>0;i/=2){
			bin =(i%2)+bin;
			
		}
		System.out.println( num + " :" +bin);
		
		// Conversion of Binary using  Built in library 
		System.out.println(Integer.toBinaryString(num)); // 12 - 1100
	}
}
