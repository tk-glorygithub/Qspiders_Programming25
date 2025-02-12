import java.util.Scanner;
class  UpperCaseChar
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a Character");	
		char ch = sc.next().charAt(0);
		
		/*if(ch >=65 && ch <= 90){
		System.out.println( "The char is Upper case case");
		}
		else {
		 System.out.println("It is not upper case");	
		}
		*/
		 String  output =((ch >= 'A' && ch <= 'Z') ||(ch >= 'a' && ch <= 'z')) ?((ch >= 'a' && ch <= 'z') ?( ch + "  It is Lower case" ):( ch + "   It is  upper case")):((ch >= '0' && ch <= '9')?(ch + "   It is Digit"):( ch + ch + "  It is  Special Character"));
		System.out.println(output);
	}
}
