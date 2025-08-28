 import java.util.Arrays;

class Palandromic_Array 
{                        
	                                  
	public static boolean ispalandrome(int arr){
		int dup = arr;  
		 if(reverese(arr) == dup){
		return true;	
		}
		else 
			return false;
	}   
	                          
		public static int reverese(int val){ 
			int sum =0;
			while(val>0){
		
			int rev = val%10;   
			 sum = sum*10+rev;    
			 val = val/10;  
			}
			
			return sum;
		}
		
	public static void main(String[] args) 
	{             // 0    1    2   3   4   5
		int arr[] = {182,121,676,9898,764,111};
		for(int i = 0;i<arr.length;i++){
		if(ispalandrome(arr[i])){
		System.out.print(arr[i] + "  ");	
		}
		
		}
		
	}
}
 

