 import java.util.Arrays;

class Prime_Array 
{
	public static boolean isprime(int arr){
		
		if( arr ==1 || arr==0) return false;
		for(int i = 2;i<arr/2;i++){
		if(arr %i ==0){
		return false;	
		}
		}
		return true;
			
		}
		
	public static void main(String[] args) 
	{
		int arr[] = {18,8,2,3,5,4,7,6,9,0};
		for(int i = 0;i<arr.length;i++){
		if(isprime(arr[i])){
		System.out.print(arr[i] + "  ");	
		}
		
		}
		
	}
}
 

