import java.util.*;
class KiethNumber 
{
	public static void main(String[] args) 
	{
		int num =19;
		int dup = num;
		int len =0;
		int sum =0;
		boolean flag = true;
		
		//loop to get the length of Number
		for(int i = num;i>0;i/=10)
			len++;
		
		//we used the len as a size of an array
		int []arr = new int[len];
		
		// loop to store the init digits from a number
		for(int i = len-1;i>=0;i--){
		int rem = num%10;
		arr[i] = rem;
		num /=10;
		}
		
		for(; ;){
		// loop find the sum of  Digits
		for(int i =0;i<len;i++)
			sum+=arr[i];
		
		//Swapping of elements
		for(int i =1;i<len;i++)
			arr[i-1] = arr[i];
		arr[len-1] = sum;
		
		if(dup ==sum){
		break;	
		}
		if(sum >dup){
		flag = false;
		break;
		}
		sum = 0;
		
			
		}
		if(flag){
		System.out.println( dup + " is Kieth Number");
		}
		else{
		System.out.println(dup + " is not Keith Number ");	
		}
	}
}
