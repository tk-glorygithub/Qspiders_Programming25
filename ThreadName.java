
import java.util.Scanner;
class ThreadName
{
	public static void main(String[] args) 
	throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next().toUpperCase();
		int leng = name.length();
		
		for(int i=0;i<=leng;i++){
		System.out.println(name.charAt(i));	
		Thread.sleep(2000);
		}
		
	}
}
