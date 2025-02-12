import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		String  Op  = ( ch =='a' || ch =='i' ||  ch =='i' ||  ch =='o' ||  ch =='u' )?( ch + " is a Vowel"):( ch + " is a Consonant");
		
		System.out.println( Op);
	}
}
