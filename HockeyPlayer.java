import java.util.Scanner;

class HockeyPlayer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(	System.in);
		System.out.println("Enter the Situation ");
		String str = sc.next();
		
	   int  count0 = 0;
		int count1 = 0;
		
		for(int  i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch =='1'){
			 count1++;	
			 count0=0;
			}
			else if(ch =='0'){
			 count0++;	
			 count1=0;
			}
			
			if(count1 >= 7 || count0 >= 7){
				break;
			}
		}
		System.out.println((count1 >= 7 || count0 >= 7)?(" Dangerous Situation"):( " Normal Situation"));
	}
}
