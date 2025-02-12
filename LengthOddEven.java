import java.util.Scanner;
class LengthOddEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();;
		int length = String.valueOf(num).length();
		int Value = 0;
		int FinalValue = 0;
		System.out.println("The length of Num is  " +length); 
		
		if (length %2 == 0){
			for( int i =length;i>0;i--){
				int rem = num % 10;
				if(rem %2 != 0){
					Value = rem +1;
				}
				else {
					Value = rem;
				}
				
			FinalValue = Value + FinalValue*10;
;
				num = num /10;
			}
			String ans=Integer.toString(FinalValue);
			StringBuffer sb=new StringBuffer(ans);
			System.out.println(sb.reverse());
		
			
		}
		else if(length %2 != 0){
		
				for( int i =length;i>0;i--){
				int rem = num % 10;
				if(rem %2 == 0){
					Value = rem +1;
				}
				else {
					Value = rem;
				}
				 
				
			FinalValue = Value + FinalValue*10;
;
				num = num /10;
			}
			
			
          String ans=Integer.toString(FinalValue);
			StringBuffer sb=new StringBuffer(ans);
			System.out.println(sb.reverse());
			
		}
		//System.out.println("No op");
		
	}
}
