import java.util.Scanner;

class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		String  str = new Scanner(System.in).next();
		
		boolean flag = false;
		for(int i=0;i<str.length();i++){
		 if(str.charAt(i)=='0')	{
		flag = true;
		break;
			 
		 }
		}
		if(flag && str.charAt(0) !='0'){
		System.out.println( str +" is a Duck Number");	
		}
		else{
		System.out.println( str +" is Not a Duck Number");		
		}
	}
}

