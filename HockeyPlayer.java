import java.util.Scanner;

class HockeyPlayer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(system.in);
		System.out.println("Enter the Situation ");
		string str = sc.next();
		
	    count0 = 0;
		count1 = 0;
		
		for( i = 1;i<str.length;i++){
			char ch = str.charAt(i);
			if(ch ==1){
			count1++;	
			}
			else if(ch ==0){
			count0++;	
			}
			else{
				count1 =0;
				count0 =0;
			}
		}
		System.out.println((count1 >= 7 || count0 >= 7)?(" Dangerous Situation"):( " Normal Situation"));
	}
}
